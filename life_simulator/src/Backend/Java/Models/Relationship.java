package Models;

import Models.Character;
import GameMechanics.People.otherCharacter;

public class Relationship {

    public enum relationshipType {
        STRANGER,
        ACQUAINTANCE,
        FRIEND,
        FAMILY_MEMBER,
        ROMANTIC_PARTNER
    }

    private relationshipType relationshipType;
    private int relationshipLevel;
    private Character mainPlayer;
    private otherCharacter otherCharacter;

    public Relationship (Character mainPlayer, otherCharacter otherCharacter, relationshipType relationshipType, int relationshipLevel) {
        this.mainPlayer = mainPlayer;
        this.otherCharacter = otherCharacter;
        this.relationshipType = relationshipType;
        this.relationshipLevel = relationshipLevel;
    }

    public void createRelationship(Character mainPlayer, otherCharacter otherCharacter) {
        Relationship relationship = new Relationship (mainPlayer, otherCharacter, relationshipType.STRANGER, 0);
    }

    public void strengthenRelationship() {
        relationshipLevel++;
    }
    
}
