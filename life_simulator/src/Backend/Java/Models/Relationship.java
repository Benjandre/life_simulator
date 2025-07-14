package Backend.Models;

import Backend.Models.Character;
import GameMechanics.People.otherCharacter;

public class Relationship {

    public enum relationshipType {
        STRANGER,
        ACQUAINTANCE,
        FRIEND,
        FAMILY_MEMBER,
        ROMANTIC_PARTNER
    }

    public relationshipType relationshipType;
    private int relationshipLevel;
    private Character player;
    private otherCharacter person;

    public Relationship (Character player, otherCharacter person, relationshipType relationshipType, int relationshipLevel) {
        this.player = player;
        this.person = person;
        this.relationshipType = relationshipType;
        this.relationshipLevel = relationshipLevel;
    }

    public void createRelationship(Character player, otherCharacter person) {
        Relationship relationship = new Relationship (player, person, relationshipType.STRANGER, 0);
    }

    public void strengthenRelationship() {
        relationshipLevel++;
    }
    
}
