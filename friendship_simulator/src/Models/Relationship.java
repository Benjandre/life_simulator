package Models;

import Models.Player;
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
    private Player player;
    private Person person;

    public Relationship (Player player, Person person, relationshipType relationshipType, int relationshipLevel) {
        this.player = player;
        this.person = person;
        this.relationshipType = relationshipType;
        this.relationshipLevel = relationshipLevel;
    }

    public void createRelationship() {
        Relationship relationship = new Relationship (player, person, relationshipType.STRANGER, 0);
    }

    public void strengthenRelationship() {
        relationshipLevel++;
    }
    
}
