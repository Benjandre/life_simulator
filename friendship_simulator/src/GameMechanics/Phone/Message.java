package GameMechanics.Phone;

import Models.Friend;
import Models.Player;

public class Message {

    public Player player;
    public Friend friend;

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
    public Message(Player player, Friend friend, messageType messageType) {
        this.player = player;
        this.friend = friend;
        this.messageType = messageType;
    }

    public Player getPlayer() {
        return player;
    }

    public Friend getFriend() {
        return friend;
    }

    public messageType getMessageType() {
        return messageType;
    }
    
}
