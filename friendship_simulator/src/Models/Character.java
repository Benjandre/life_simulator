package Models;

import GameMechanics.People.Person;
import Models.Relationship;

public class Character {

    public enum Gender {
        FEMALE,
        MALE,
        NON_BINARY
    }

    public enum oralHygiene {
        BAD,
        OK,
        GOOD
    }

    public enum bodySmell {
        BAD,
        OK,
        GREAT
    }

    public enum Bladder {
        EMPTY,
        MODERATE,
        FULL
    }

    public enum Hunger {
        STARVING,
        HUNGRY,
        SATISFIED,
        FULL
    }

    public String firstName;
    public String lastName;
    public String fullName = firstName + "" + lastName;
    public Gender gender;
    public int age;
    public int confidence;
    public oralHygiene oralHygiene;
    public bodySmell bodySmell;
    public Bladder bladder;
    public Hunger hunger;

    public Character (String firstName, String lastName, Gender gender, int age, int confidence, oralHygiene oralHygiene, bodySmell bodySmell, Bladder bladder, Hunger hunger) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.confidence = confidence;
        this.oralHygiene = oralHygiene; // Default value
        this.bodySmell = bodySmell;
        this.bladder = bladder; // Default value
        this.hunger = hunger; // Default value

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

    public void greet(Person person) {
    }
}