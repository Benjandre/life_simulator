package GameMechanics.Phone;

import GameMechanics.People.otherCharacter;
import Models.Character;

public class Message {

    public Character player;
    public otherCharacter friend;

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
    public Message(Character player, otherCharacter friend, messageType messageType) {
        this.player = player;
        this.friend = friend;
        this.messageType = messageType;
    }

    public Character getPlayer() {
        return player;
    }

    public otherCharacter getFriend() {
        return friend;
    }

    public messageType getMessageType() {
        return messageType;
    }
    
}
