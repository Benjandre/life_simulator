package GameMechanics.Relationship;

public class Relationship {

    private enum relationshipType {
        ACQUAINTANCE,
        FRIEND,
        LOVER,
        RELATIVE,
    }

    private relationshipType relationshipType;
    private int relationshipStregth;
    
    public Relationship (relationshipType relationshipType, int relationshipStregth) {
        this.relationshipType = relationshipType;
        /* 
        Makes it so that relationshipStregth can't exceed a value of 5.
        For each type of relationship, the relationshipStregth will be reset to 0.
        */
        this.relationshipStregth = Math.min(relationshipStregth, 5);
    }

    public relationshipType getRelationshiType() {
        return relationshipType;
    }

    public int getRelationshipStregth() {
        return relationshipStregth;
    }

    public void strengthenRelationship() {
        if (relationshipType == null) {
            relationshipType = relationshipType.ACQUAINTANCE;
            relationshipStregth = 1;
            return;
        }
        switch (relationshipType) {
            case ACQUAINTANCE:
                if (relationshipStregth < 5) {
                    relationshipStregth++;
                }
                if (relationshipStregth == 5) {
                    relationshipType = relationshipType.FRIEND;
                    resetRelationshipStrength();
                }
                break;
            case FRIEND:
                if (relationshipStregth < 5) {
                    relationshipStregth++;
                }
                if (relationshipStregth == 5) {
                    relationshipType = relationshipType.LOVER;
                    resetRelationshipStrength();
                }
                break;
            case LOVER:
                if (relationshipStregth < 5) {
                    relationshipStregth++;
                }
                // You can add more logic here if needed for LOVER
                break;
            case RELATIVE:
                if (relationshipStregth < 5) {
                    relationshipStregth++;
                }
                // RELATIVE type may not change further
                break;
            default:
                break;
        }
    }

        public void weakenRelationship() {
        if (relationshipType == null) {
            return;
        }
        switch (relationshipType) {
            case ACQUAINTANCE:
                if (relationshipStregth > 0) {
                    relationshipStregth--;
                }
                // If desired, you could handle dropping below 0 here
                break;
            case FRIEND:
                if (relationshipStregth > 0) {
                    relationshipStregth--;
                }
                if (relationshipStregth == 0) {
                    relationshipType = relationshipType.ACQUAINTANCE;
                    relationshipStregth = 5;
                }
                break;
            case LOVER:
                if (relationshipStregth > 0) {
                    relationshipStregth--;
                }
                if (relationshipStregth == 0) {
                    relationshipType = relationshipType.FRIEND;
                    relationshipStregth = 5;
                }
                break;
            case RELATIVE:
                if (relationshipStregth > 0) {
                    relationshipStregth--;
                }
                // RELATIVE type may not change further
                break;
            default:
                break;
        }
    }

    public void resetRelationshipStrength() {
        relationshipStregth = 0;
    }
}
