package gameMechanics.Phone;

public class Message {

    private String sender;
    private String receiver;
    private String content;
    private long timestamp;

    // Constructor
    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = System.currentTimeMillis(); // Set the current time as the timestamp
    }

    // Getters
    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }
    
}
