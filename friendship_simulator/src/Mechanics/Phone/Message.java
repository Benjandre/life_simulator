package gameMechanics.Phone;

public class Message {

    public String sender;
    public String receiver;

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
    public Message(String sender, String receiver, messageType messageType) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageType = messageType;
    }

    // Getters
    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public messageType getMessageType() {
        return messageType;
    }
    
}
