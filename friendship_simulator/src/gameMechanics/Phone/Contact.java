package gameMechanics.Phone;

import gameAssets.Player_And_Friend.Friend.Friend;

public class Contact {
    
    private Friend firstName;
    private Friend lastName;
    private String phoneNumber;

    // Constructor
    public Contact(Friend firstName, Friend lastName, String phoneNumber) {
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
