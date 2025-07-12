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
    
    public Relationship (relationshipType relationshipType, int relationshipStrength) {
        this.relationshipType = relationshipType;
        /* 
        Makes it so that relationshipStrength can't exceed a value of 5.
        For each type of relationship, the relationshipStrength will be reset to 0.
        */
        this.relationshipStrength = Math.min(relationshipStrength, 5);
    }

    public relationshipType getRelationshiType() {
        return relationshipType;
    }

    public int getRelationshipStrength() {
        return relationshipStrength;
    }

    public void strengthenRelationship() {
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
                // You can add more logic here if needed for LOVER
                break;
            case RELATIVE:
                if (relationshipStrength < 5) {
                    relationshipStrength++;
                }
                // RELATIVE type may not change further
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
                // If desired, you could handle dropping below 0 here
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
                // RELATIVE type may not change further
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
        // If the romantic relationship is "OK" or better, the people involved become friends.
        else if (relationshipType == relationshipType.LOVER && (relationshipQuality == relationshipQuality.GOOD || relationshipQuality == relationshipQuality.NEUTRAL || relationshipQuality == relationshipQuality.EXCELLENT)) {
            becomeFriend();
        // If the romantic relationship is "strained" or worse, the people involved start to dislike each other.
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
