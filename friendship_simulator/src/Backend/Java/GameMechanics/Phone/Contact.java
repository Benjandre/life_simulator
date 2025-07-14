package GameMechanics.Phone;

import GameMechanics.People.otherCharacter;

public class Contact {
    
    private otherCharacter firstName;
    private otherCharacter lastName;
    private String phoneNumber;

    // Constructor
    public Contact(otherCharacter firstName, otherCharacter lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getfirstName() {
        return firstName.toString();
    }

    public String getLastName() {
        return lastName.toString();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
}
