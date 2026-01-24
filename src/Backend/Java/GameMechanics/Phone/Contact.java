package Backend.Java.GameMechanics.Phone;

import Backend.Java.GameMechanics.People.OtherCharacter;

public class Contact {
    private OtherCharacter OtherCharacter;
    private String phoneNumber;

    public Contact (OtherCharacter OtherCharacter, String phoneNumber) {
        this.OtherCharacter = OtherCharacter;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return OtherCharacter.getFirstName();
    }

    public String getLastName() {
        return OtherCharacter.getLastName();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}