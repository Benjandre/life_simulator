package gameMechanics.Phone;

import gameAssets.Player_And_Friend.*;
import gameAssets.Player_And_Friend.Friend.Friend;
import gameAssets.Player_And_Friend.Player.Player;

public class Call {

    public Player caller;
    public Friend receiver;
    public int amountOfWordsSpoken;
    public boolean isActive;

    public enum wordsToSay {
        GREET,
        TALK_ABOUT_ALL_KINDS_OF_THINGS,
        TALK_ABOUT_LIFE,
        TALK_ABOUT_PRIVATE_STUFF,
        SAY_GOODBYE
    }

    public wordsToSay wordToSay;

    // Constructor
    public Call(Player caller, Friend receiver) {
        this.caller = caller;
        this.receiver = receiver;
        this.amountOfWordsSpoken = 0;
        this.isActive = true;
    }

    public void call(Friend receiver) {
        this.receiver = receiver;
        if (receiver != null) {
            isActive = true;
            System.out.println("Calling " + receiver.getFirstName() + "" + receiver.getLastName() + " at " + receiver.getPhoneNumber());
        } else {
            isActive = false;
            System.out.println("Error: You cannot call a non-existent contact.");
            return;
        }
    }

    public void saySomething() {

    }

    public void endCall(Friend receiver) {
        if (isActive == true) {
            isActive = false;
            System.out.println("Call ended with " + receiver.getFirstName() + "" + receiver.getLastName() + ".");
            addCallToHistory(receiver);
        } else {
            System.out.println("Error: You cannot end a call that is not active.");
        }
        
    }

    public void addCallToHistory(Friend receiver) {
        if (isActive == false && receiver != null) {
            addCallToHistory(receiver);
        }
    }
    
}
