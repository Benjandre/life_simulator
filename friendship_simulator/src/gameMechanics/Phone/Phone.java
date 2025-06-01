package gameMechanics.Phone;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void call(Contact contact) {
        if (isOn == true && contact != null) {
            // Logic to initiate a call to the receiver
            System.out.println("Calling " + contact.getfirstName() + "" + contact.getLastName() + " at " + contact.getPhoneNumber());
            // Add call to history
            callHistory.add("Call to " + contact.getfirstName() + "" + contact.getLastName() +  " at " + contact.getPhoneNumber());
        } else {
            System.out.println("Phone is off. Please turn it on to make a call.");
            
        }

    }

    public void sendMessage(Contact contact, String messageContent) {
        try {
            if (contact == null) {
                throw new IllegalArgumentException("Contact cannot be null");
            }
            if (messageContent == null || messageContent.isEmpty()) {
                throw new IllegalArgumentException("Message content cannot be null or empty");
            } else {
                if (isOn == true) {
                    Scanner messageInput = new Scanner(System.in);
                    System.out.println("Enter your message to " + contact.getfirstName() + " " + contact.getLastName() + ": ");
                    messageContent = messageInput.nextLine();
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
