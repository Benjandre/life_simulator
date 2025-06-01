package gameMechanics.Phone;

import java.util.ArrayList;

import gameMechanics.Phone.Contact;
import gameMechanics.Phone.Message;
import gameAssets.Player_And_Friend.Player.Player;

public class Phone {

    private Player owner;
    private ArrayList<Contact> contacts;
    private ArrayList<Message> messages;
    private ArrayList<String> callHistory;
    private boolean isOn;
    private String phoneNumber;

    public Phone(Player owner, String phoneNumber) {
        this.owner = owner;
        this.phoneNumber = phoneNumber;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.callHistory = new ArrayList<>();
        this.isOn = true; // Phone is on by default
    }

    public void turnOnPhone() {
        if (isOn == false) {

            isOn = true;

        } else {

            System.out.println("Phone is already on.");

        }
    }

    public void turnOffPhone() {
        if (isOn == true) {

            isOn = false;

        } else {

            System.out.println("You can't turn your phone off, since it is already off.");

        }
    }

    public void call(Contact receiver){
        if (isOn == true && receiver != null) {
            // Logic to initiate a call to the receiver
            System.out.println("Calling " + receiver.getName() + " at " + receiver.getPhoneNumber());
            // Add call to history
            callHistory.add("Call to " + receiver.getName() + " at " + receiver.getPhoneNumber());
        } else {
            System.out.println("Phone is off. Please turn it on to make a call.");
            
        }

    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }
    
    public Player getOwner() {
        return owner;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public boolean isOn() {
        return isOn;
    }
    
}
