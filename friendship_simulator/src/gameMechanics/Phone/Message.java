package gameMechanics.Phone;

public class Message {

    private String sender;
    private String receiver;
    private String messageContent;
    private long timestamp;

    // Constructor
    public Message(String sender, String receiver, String messageContent) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageContent = messageContent;
        this.timestamp = System.currentTimeMillis(); // Set the current time as the timestamp
    }

    // Getters
    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public long getTimestamp() {
        return timestamp;
    }
    
}
