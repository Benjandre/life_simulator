package GameMechanics.Relationship;

public class Relationship {

    private enum relationshipType {
        ACQUAINTANCE,
        FRIEND,
        LOVER,
        RELATIVE
    }

    private enum relationshipQuality {
        EXCELLENT,
        GOOD,
        NEUTRAL,
        STRAINED,
        BAD
    }

    private relationshipType relationshipType;
    private relationshipQuality relationshipQuality;
    private int relationshipStrength;
    
    public Relationship(relationshipType relationshipType, int relationshipStrength) {
        this.relationshipType = relationshipType;
        this.relationshipStrength = Math.min(relationshipStrength, 5);
    }

    public relationshipType getRelationshiType() {
        return relationshipType;
    }

    public int getRelationshipStrength() {
        return relationshipStrength;
    }

    public boolean isRelationshipNull() {
        return relationshipType == null;
    }

    public boolean isAcquaintance() {
        return relationshipType == relationshipType.ACQUAINTANCE;
    }

    public boolean isFriend() {
        return relationshipType == relationshipType.FRIEND;
    }

    public boolean isLover() {
        return relationshipType == relationshipType.LOVER;
    }

    public boolean isRelative() {
        return relationshipType == relationshipType.RELATIVE;
    }

    private boolean isRelationshipStrengthFive() {
        return relationshipStrength == 5;
    }

    private boolean isRelationshipStrengthZero() {
        return relationshipStrength == 0;
    }

    private boolean relationshipStrengthIsLessThanFive() {
        return relationshipStrength < 5;
    }

    private boolean relationshipStrengthIsMoreThanZero() {
        return relationshipStrength > 0;
    }

    // This method needs some work.
    public void growRelationship() {
        if (isRelationshipNull()) {
            becomeAcquaintance();
            relationshipStrength++;
            return;
        }
        switch (relationshipType) {
            case ACQUAINTANCE:
                if (isRelationshipStrengthZero()) {
                    relationshipStrength++;
                }
                if (isRelationshipStrengthFive()) {
                    becomeFriend();
                    resetRelationshipStrength();
                }
                break;
            case FRIEND:
                if (relationshipStrengthIsLessThanFive()) {
                    relationshipStrength++;
                }
                if (isRelationshipStrengthFive()) {
                    becomeLover();
                    resetRelationshipStrength();
                }
                break;
            case LOVER:
                if (relationshipStrengthIsLessThanFive()) {
                    relationshipStrength++;
                }
                break;
            case RELATIVE:
                if (relationshipStrengthIsLessThanFive()) {
                    relationshipStrength++;
                }
                break;
            default:
                break;
        }
    }

    // This method needs some work.
    public void worsenRelationship() {
        if (relationshipType == null) {
            System.out.println("You can't worsen a relationship, which doesn't exist.");
            return;
        }
        switch (relationshipType) {
            case ACQUAINTANCE:
                if (relationshipStrengthIsMoreThanZero()) {
                    relationshipStrength--;
                }
                break;
            case FRIEND:
                if (relationshipStrengthIsMoreThanZero()) {
                    relationshipStrength--;
                }
                if (isRelationshipStrengthZero()) {
                    becomeAcquaintance();
                    relationshipStrength = 5;
                }
                break;
            case LOVER:
                if (relationshipStrengthIsMoreThanZero()) {
                    relationshipStrength--;
                }
                if (isRelationshipStrengthZero()) {
                    becomeFriend();
                    relationshipStrength = 5;
                }
                break;
            case RELATIVE:
                if (relationshipStrengthIsMoreThanZero()) {
                    relationshipStrength--;
                }
                break;
            default:
                break;
        }
    }

    public void endRelationship() {
        if (relationshipType == null) {
            System.out.println("You can't end a relationship, which doesn't exist.");
            return;
        } 
        else if (relationshipType == relationshipType.LOVER && (relationshipQuality == relationshipQuality.GOOD || relationshipQuality == relationshipQuality.NEUTRAL || relationshipQuality == relationshipQuality.EXCELLENT)) {
            becomeFriend();
        } else if ((relationshipType == relationshipType.LOVER || relationshipType == relationshipType.FRIEND) && (relationshipQuality == relationshipQuality.STRAINED || relationshipQuality == relationshipQuality.BAD)) {
            becomeAcquaintance();
            if (relationshipQuality != relationshipQuality.STRAINED) {
                makeRelationshipBad();
            }
            makeRelationshipBad();
        } else {
            becomeAcquaintance();
        }
    }

    public void becomeFriend() {
        relationshipType = relationshipType.FRIEND;
    }

    public void becomeAcquaintance() {
        relationshipType = relationshipType.ACQUAINTANCE;
    }

    public void becomeLover() {
        relationshipType = relationshipType.LOVER;
    }

    public void makeRelationshipExcellent() {
        relationshipQuality = relationshipQuality.EXCELLENT;
    }

    public void makeRelationshipGood() {
        relationshipQuality = relationshipQuality.GOOD;
    }

    public void makeRelationshipNeutral() {
        relationshipQuality = relationshipQuality.NEUTRAL;
    }

    public void makeRelationshipStrained() {
        relationshipQuality = relationshipQuality.STRAINED;
    }

    public void makeRelationshipBad() {
        relationshipQuality = relationshipQuality.BAD;
    }

    public void resetRelationshipStrength() {
        relationshipStrength = 0;
    }
}