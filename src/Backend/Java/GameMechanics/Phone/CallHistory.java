package GameMechanics.Phone;

public class CallHistory {
    private String caller;
    private String receiver;
    private String timestamp;

    // Constructor
    public callHistory(String caller, String receiver, String timestamp) {
        this.caller = caller;
        this.receiver = receiver;
        this.timestamp = timestamp;
    }

    // Getters
    public String getCaller() {
        return caller;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void addCallToHistory(String caller, String receiver, String timestamp) {
        // Logic to add the call to the call history
        this.caller = caller;
        this.receiver = receiver;
        this.timestamp = timestamp;
    }
}
