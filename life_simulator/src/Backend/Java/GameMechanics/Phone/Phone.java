package GameMechanics.Phone;

import java.util.ArrayList;
import java.util.Scanner;

import GameMechanics.Phone.Contact;
import GameMechanics.Phone.Message;
import GameMechanics.Phone.Message.messageType;
import GameMechanics.Phone.Call;
import GameMechanics.People.MainPlayer;

public class Phone {

    private MainPlayer owner;
    private Call call;
    private ArrayList<Contact> contacts;
    private ArrayList<Message> messages;
    private ArrayList<Call> callHistory;
    private boolean isOn;

    public Phone(MainPlayer owner) {
        this.owner = owner;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.callHistory = new ArrayList<>();
        this.isOn = true; // Phone is on by default
    }
    // New, concise method names

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if (isOn == false) {
            isOn = true;
            System.out.println("You turned your phone on.");
        } else {
            System.out.println("Phone is already on.");
        }
    }

    public void turnOff() {
        if (isOn == true) {
            isOn = false;
            System.out.println("You turned your phone off.");
        } else {
            System.out.println("You can't turn your phone off, since it is already off.");
        }
    }

    public void call (Contact contact) {
    if (isOn == true && call.isActive == false && contact != null) {
            Call call = new Call(owner, receiver);
            call.isActive = true;
            // Logic to initiate a call to the receiver
            System.out.println("Calling " + contact.getfirstName() + "" + contact.getLastName() + " at " + contact.getPhoneNumber());
            // Add call to history
            // callHistory.add("Call to " + contact.getfirstName() + "" + contact.getLastName() +  " at " + contact.getPhoneNumber());
        } else {
            System.out.println("Phone is off. Please turn it on to make a call.");
    }

    public void addCallToHistory(Call call) {
        callHistory.add(call);
        System.out.println("Call to " + call.receiver.getFirstName() + "" + call.receiver.getLastName() + " has been added to the call history.");
    }

    // This needs fixing.
    public void sendMessage(Contact contact) {
        if (isOn == false) {
            System.out.println("You can't send a message, while your phone is turned off.");
        } else if (contact == null) {
                System.out.println("Contact cannot be null");
            } else {
                    inputMessage();
                }
    }

    public void inputMessage() {
        try {
            if(isOn == true) {
            Scanner messageInput = new Scanner(System.in);
                    System.out.println("What kind of message would you like to send to " + contact.getfirstName() + " " + contact.getLastName() + "?: ");
                    System.out.println("1. Positive.");
                    System.out.println("2. Negative.");
                    System.out.println("3. Neutral.");
                    String input = messageInput.nextLine();
                    if (input == "1") {
                        System.out.println("You sent a positive message to " + contact.getFirstName() + ".");
                        Message message = new Message(owner.getFirstName(), contact.getfirstName(), messageType);
                        saveMessage(message);
                    }
                    else if (input == "2") {
                        System.out.println("You sent a negative message to " + contact.getFirstName() + ".");
                        Message message = new Message(owner.getFirstName(), contact.getfirstName(), messageType);
                        saveMessage(message);
                    }
                    else if (input == "3") {
                        System.out.println("You sent a neutral message to " + contact.getFirstName() + ".");
                        Message message = new Message(owner.getFirstName(), contact.getfirstName(), messageType);
                        saveMessage(message);
                    } else {
                    throw new IllegalArgumentException("Invalid message.");
                    System.out.println("Message sent to " + contact.getfirstName() + " " + contact.getLastName() + ": " + messageContent);
                }
            } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return;
        }
    }
    }

    public void validateMessage(Message message) {

    }

    public void saveMessage(Message message) {
        messages.add(message);
        System.out.println("Message has been saved.");
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
        if (isOn == true && !contacts.contains(contact)) {
                contacts.add(contact);
                System.out.println("You added " + contact.getfirstName() + "" + contact.getLastName() + " to your contact list.");
        } else if (isOn == true && contacts.contains(contact)) {
            System.out.println("You already have " + contact.getfirstName() + "" + contact.getLastName() + " in your contact list.");
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

    public void selectOption() {
        try {
            if (isOn == true) {
                System.out.println("What would you like to do?:");
                System.out.println("1. Call someone.");
                System.out.println("2. Send someone a message.");
                Scanner scanner = new Scanner(System.in);
                String selectOption = scanner.nextLine();
                switch (selectOption) {
                    case "1":
                        System.out.println("Who would you like to call?: ");
                        this.selectOption = scanner.nextLine();
                        break;
                    case "2":
                        break;
                    default:
                        System.out.println("That isn't a valid option. Please try something else.");
                }
            } else {
                System.out.println("You can't select an option, while your phone is turned off.");
            }
        } catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        }
    }
    
    public MainPlayer getOwner() {
        return owner;
    }
    
    /* 
    
    public Contact getPhoneNumber() {
        return contacts.
    }

    */
    
}
