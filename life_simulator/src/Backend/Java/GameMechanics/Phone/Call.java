package GameMechanics.Phone;

import java.util.Scanner;

// Update the import path to the correct location of Player class
import Models.Character;
import GameMechanics.People.mainPlayer;
import GameMechanics.People.otherCharacter;

public class Call {

    public mainPlayer caller;
    public otherCharacter receiver;
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
    public Call(mainPlayer caller, otherCharacter receiver) {
        this.caller = caller;
        this.receiver = receiver;
        this.amountOfWordsSpoken = 0;
        this.isActive = true;
    }

    public void call(otherCharacter receiver) {
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
        saySomethingInput();
        if () {
            
        }
    }

    public void saySomethingInput() {
        Scanner oralInput = new Scanner(System.in);
        String saySomethingString = oralInput.nextLine();
    }

    public void validateSaySomethingInput() {
        
    }


    public void endCall(otherCharacter receiver) {
        if (isActive == true) {
            isActive = false;
            System.out.println("Call ended with " + receiver.getFirstName() + "" + receiver.getLastName() + ".");
            addCallToHistory(receiver);
        } else {
            System.out.println("Error: You cannot end a call that is not active.");
        }
        
    }

    public void addCallToHistory(otherCharacter receiver) {
        if (isActive == false && receiver != null) {
            addCallToHistory(receiver);
        }
    }
    
}
