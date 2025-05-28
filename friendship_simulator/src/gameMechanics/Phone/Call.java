package gameMechanics.Phone;

import gameAssets.Player_And_Friend.*;

public class Call {

    private Player caller;
    private Friend receiver;
    private int callDuration;
    private boolean isActive;

    // Constructor
    public Call(Player caller, Friend receiver) {
        this.caller = caller;
        this.receiver = receiver;
        this.callDuration = 0; // Call duration starts at 0
        this.isActive = true; // Call is active when created
    }

    public void endCall() {
        this.isActive = false; // End the call
    }

    public void addCallToHistory() {
        if (!isActive) {
            // Logic to add the call to the call history of the caller
            caller.addCallToHistory(this);
        }
    }
    
}
