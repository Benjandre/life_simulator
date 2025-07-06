package GameMechanics.Phone;

import GameMechanics.People.Person;

public class Contact {
    
    private Person firstName;
    private Person lastName;
    private String phoneNumber;

    // Constructor
    public Contact(Person firstName, Person lastName, String phoneNumber) {
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
