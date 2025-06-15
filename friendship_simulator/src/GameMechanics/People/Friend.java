package GameMechanics.People;

import Models.Player.Bladder;
import Models.Player.oralHygiene;
import gameAssets.Player_And_Friend.Player.Player;
import gameAssets.Player_And_Friend.Player.Player.Gender;
import gameAssets.Player_And_Friend.Player.Player.bodySmell;

public class Friend extends Player {


    public Friend(String firstName, String lastName, Gender gender, int age, int confidence, oralHygiene oralHygiene, bodySmell bodySmell, Bladder bladder) {
        super (firstName, lastName, gender, age, confidence, oralHygiene, bodySmell, bladder);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }

    public int getConfidence() {
        return confidence;
    }

    public oralHygiene getOralHygiene() {
        return oralHygiene;
    }

    public bodySmell getBodySmell() {
        return bodySmell;
    }

    
}
