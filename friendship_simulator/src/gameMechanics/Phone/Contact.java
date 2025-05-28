package gameMechanics.Phone;

import gameAssets.Player_And_Friend.Friend;

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
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
