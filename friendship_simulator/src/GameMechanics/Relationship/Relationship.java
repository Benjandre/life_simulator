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

    private relationshipType getRelationshiType() {
        return relationshipType;
    }

    private int getRelationshipStrength() {
        return relationshipStrength;
    }

    private void strengthenRelationship() {
        if (relationshipType == null) {
            becomeAcquaintance();
            relationshipStrength = 1;
            return;
        }
        switch (relationshipType) {
            case ACQUAINTANCE:
                if (relationshipStrength < 5) {
                    relationshipStrength++;
                }
                if (relationshipStrength == 5) {
                    relationshipType = relationshipType.FRIEND;
                    resetRelationshipStrength();
                }
                break;
            case FRIEND:
                if (relationshipStrength < 5) {
                    relationshipStrength++;
                }
                if (relationshipStrength == 5) {
                    relationshipType = relationshipType.LOVER;
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

    private void weakenRelationship() {
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

    private void endRelationship() {
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

    private void becomeFriend() {
        relationshipType = relationshipType.FRIEND;
    }

    private void becomeAcquaintance() {
        relationshipType = relationshipType.ACQUAINTANCE;
    }

    private void makeRelationshipExcellent() {
        relationshipQuality = relationshipQuality.EXCELLENT;
    }

    private void makeRelationshipGood() {
        relationshipQuality = relationshipQuality.GOOD;
    }

    private void makeRelationshipNeutral() {
        relationshipQuality = relationshipQuality.NEUTRAL;
    }

    private void makeRelationshipStrained() {
        relationshipQuality = relationshipQuality.STRAINED;
    }

    private void makeRelationshipBad() {
        relationshipQuality = relationshipQuality.BAD;
    }

    private void resetRelationshipStrength() {
        relationshipStrength = 0;
    }
}