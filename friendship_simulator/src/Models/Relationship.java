package Models;

import Models.Character;
import GameMechanics.People.Person;

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
    private Person person;

    public Relationship (Character player, Person person, relationshipType relationshipType, int relationshipLevel) {
        this.player = player;
        this.person = person;
        this.relationshipType = relationshipType;
        this.relationshipLevel = relationshipLevel;
    }

    public void createRelationship(Character player, Person person) {
        Relationship relationship = new Relationship (player, person, relationshipType.STRANGER, 0);
    }

    public void strengthenRelationship() {
        relationshipLevel++;
    }
    
}
