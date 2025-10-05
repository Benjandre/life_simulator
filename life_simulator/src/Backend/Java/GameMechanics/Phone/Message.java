package GameMechanics.Phone;

import Backend.Models.Character;
import GameMechanics.People.otherCharacter;

public class Message {

    public Character mainPlayer;
    public otherCharacter otherCharacter;

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
    public Message(Character mainPlayer, otherCharacter otherCharacter, messageType messageType) {
        this.mainPlayer = mainPlayer;
        this.otherCharacter = otherCharacter;
        this.messageType = messageType;
    }

    public Character getMainPlayer() {
        return mainPlayer;
    }

    public otherCharacter getOtherCharacter() {
        return otherCharacter;
    }

    public messageType getMessageType() {
        return messageType;
    }
    
}
