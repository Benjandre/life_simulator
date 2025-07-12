package GameMechanics.People;

import Models.Relationship;

public class otherCharacter {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Relationship relationship = null;

    public otherCharacter(String firstName, String lastName, String phoneNumber, Relationship relationship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.relationship = relationship;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    
}
