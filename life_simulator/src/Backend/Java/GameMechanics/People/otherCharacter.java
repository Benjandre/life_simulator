package GameMechanics.People;

import GameMechanics.People.mainPlayer;
import Models.Relationship;
import Models.Relationship.relationshipType;
import Models.Character;

public class otherCharacter extends Character {

    public otherCharacter(String firstName, String lastName, Gender gender, int age, int confidence, Models.Character.oralHygiene oralHygiene, Models.Character.bodySmell bodySmell, Bladder bladder, Hunger hunger) {
        super(firstName, lastName, gender, age, confidence, oralHygiene, bodySmell, bladder, hunger);
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
