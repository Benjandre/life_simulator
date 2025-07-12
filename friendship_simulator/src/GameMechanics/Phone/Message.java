package GameMechanics.Phone;

import GameMechanics.People.Person;
import Models.Character;

public class Message {

    public Character player;
    public Person friend;

    /*
    This is the type of message the player can send to their friends. Each type of message results in different responses from the friends. 
    E. g. certain messages strengthens the friendship between the player and their friends, other weaken it, etc.
     */
    public enum messageType {
        GOOD,
        OK,
        BAD
    }

    public messageType messageType;
    public long timestamp;

    // Constructor
    public Message(Character player, Person friend, messageType messageType) {
        this.player = player;
        this.friend = friend;
        this.messageType = messageType;
    }

    public Character getPlayer() {
        return player;
    }

    public Person getFriend() {
        return friend;
    }

    public messageType getMessageType() {
        return messageType;
    }
    
}
