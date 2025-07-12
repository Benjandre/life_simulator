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

    private boolean isStrengthFive() {
        return relationshipStrength == 5;
    }

    private boolean isStrengthZero() {
        return relationshipStrength == 0;
    }

    private boolean strengthIsLessThanFive() {
        return relationshipStrength < 5;
    }

    private boolean strengthIsMoreThanZero() {
        return relationshipStrength > 0;
    }

    public void strengthenRelationship() {
        if (isRelationshipNull()) {
            becomeAcquaintance();
            relationshipStrength++;
            return;
        }
        switch (relationshipType) {
            case ACQUAINTANCE:
                if (canIncreaseStrength()) {
                    relationshipStrength++;
                }
                if (isStrengthMax()) {
                    becomeFriend();
                    resetRelationshipStrength();
                }
                break;
            case FRIEND:
                if (relationshipStrength < 5) {
                    relationshipStrength++;
                }
                if (relationshipStrength == 5) {
                    becomeLover();
                    resetRelationshipStrength();
                }
                break;
            case LOVER:
                if (relationshipStrength < 5) {
                    relationshipStrength++;
                }
                break;
            case RELATIVE:
                if (relationshipStrength < 5) {
                    relationshipStrength++;
                }
                break;
            default:
                break;
        }
    }

    public void weakenRelationship() {
        if (relationshipType == null) {
            System.out.println("You can't weaken a relationship, which doesn't exist.");
            return;
        }
        switch (relationshipType) {
            case ACQUAINTANCE:
                if (relationshipStrength > 0) {
                    relationshipStrength--;
                }
                break;
            case FRIEND:
                if (relationshipStrength > 0) {
                    relationshipStrength--;
                }
                if (relationshipStrength == 0) {
                    becomeAcquaintance();
                    relationshipStrength = 5;
                }
                break;
            case LOVER:
                if (relationshipStrength > 0) {
                    relationshipStrength--;
                }
                if (relationshipStrength == 0) {
                    becomeFriend();
                    relationshipStrength = 5;
                }
                break;
            case RELATIVE:
                if (relationshipStrength > 0) {
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