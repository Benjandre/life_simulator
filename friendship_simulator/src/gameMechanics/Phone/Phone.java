package gameMechanics.Phone;

import java.util.ArrayList;
import java.util.Scanner;

import gameMechanics.Phone.Contact;
import gameMechanics.Phone.Message;
import gameMechanics.Phone.Message.messageType;
import gameMechanics.Phone.Call;
import gameAssets.Player_And_Friend.Player.Player;

public class Phone {

    private Player owner;
    private Call call;
    private ArrayList<Contact> contacts;
    private ArrayList<Message> messages;
    private ArrayList<Call> callHistory;
    private boolean isOn;

    public Phone(Player owner) {
        this.owner = owner;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.callHistory = new ArrayList<>();
        this.isOn = true; // Phone is on by default
    }

    public void turnOnPhone() {
        if (isOn == false) {

            isOn = true;
            System.out.println("You turned your phone on.");

        } else {

            System.out.println("Phone is already on.");

        }
    }

    public void turnOffPhone() {
        if (isOn == true) {

            isOn = false;
            System.out.println("You turned your phone off.");

        } else {

            System.out.println("You can't turn your phone off, since it is already off.");

        }
    }

    public void call (Contact contact) {
        try {
            if (isOn == true && call.isActive == false && contact != null) {
            call.isActive = true;
            // Logic to initiate a call to the receiver
            System.out.println("Calling " + contact.getfirstName() + "" + contact.getLastName() + " at " + contact.getPhoneNumber());
            // Add call to history
            callHistory.add("Call to " + contact.getfirstName() + "" + contact.getLastName() +  " at " + contact.getPhoneNumber());
        } else {
            System.out.println("Phone is off. Please turn it on to make a call.");
        }} catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        }
    }

    // This needs fixing.
    public void sendMessage(Contact contact, messageType messageType) {
        try {
            if (contact == null) {
                throw new IllegalArgumentException("Contact cannot be null");
            }
            if (messageType == null || messageType.equals("")) {
                throw new IllegalArgumentException("Message content cannot be null or empty");
            } else {
                if (isOn == true) {
                    Scanner type = new Scanner(System.in);
                    System.out.println("What kind of message would you like to send to " + contact.getfirstName() + " " + contact.getLastName() + "?: ");
                    System.out.println("1. Positive.");
                    System.out.println("2. Negative.");
                    System.out.println("3. Neutral.");
                    input = messageType.nextInt();
                    Message message = new Message(owner.getFirstName(), contact.getfirstName(), messageContent);
                    messages.add(message);
                    System.out.println("Message sent to " + contact.getfirstName() + " " + contact.getLastName() + ": " + messageContent);
                } else {
                    System.out.println("Phone is off. Please turn it on to send a message.");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    public void displayAllContacts() {
        try {
            if (!contacts.isEmpty()) {
                for (Contact contact : contacts) {
                System.out.println(contact);
                }
            } else {
                System.out.println("You have no contacts in your contact list.");
            }
        }  catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        }
    }

    public void addContact(Contact contact) {
        try { 
            if (isOn == true && !contacts.contains(contact)) {
                contacts.add(contact);
                System.out.println("You added " + contact.getfirstName() + "" + contact.getLastName() + " to your contact list.");
        } else if (isOn == true && contacts.contains(contact)) {
            System.out.println("You already have " + contact.getfirstName() + "" + contact.getLastName() + " in your contact list.");
        }} catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        }
    }

    public void removeContact(Contact contact) {
        try {
            if (isOn == true && contacts.contains(contact)) {
                contacts.remove(contact);
                System.out.println("You removed " + contact.getfirstName() + "" + contact.getLastName() + " from your contact list.");
            } else if (isOn == true && !contacts.contains(contact)) {
                System.out.println(contact.getfirstName() + "" + contact.getLastName() + " isn't is your contact list, so you can't remove them.");
            }
        } catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        }
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
