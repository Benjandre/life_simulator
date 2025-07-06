package GameMechanics;

import Models.Player;

public class Relationship {

    private enum relationshipType {
        STRANGER,
        ACQUAINTANCE,
        FRIEND,
        FAMILY_MEMBER,
        ROMANTIC_PARTNER
    }

    private relationshipType relationshipType;
    private int relationshipLevel;

    public Relationship (relationshipType relationshipType, int relationshipLevel) {
        this.relationshipType = relationshipType;
        this.relationshipLevel = relationshipLevel;
    }

    public void strengthenRelationship() {
        relationshipLevel++;
    }
    
}
