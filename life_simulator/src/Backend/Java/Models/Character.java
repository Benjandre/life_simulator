package Models;

import Models.Relationship;
import GameMechanics.People.otherCharacter;

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

    public enum EnergyLevel {
        EXAUSTED,
        TIRED,
        MODERATE,
        ENERGETIC
    }

    private String firstName;
    private String lastName;
    private String fullName = firstName + "" + lastName;
    private Gender gender;
    private int age;
    private int confidence;
    private oralHygiene oralHygiene;
    private bodySmell bodySmell;
    private Bladder bladder;
    private Hunger hunger;
    private EnergyLevel energyLevel;

    public Character (String firstName, String lastName, Gender gender, int age, int confidence, oralHygiene oralHygiene, bodySmell bodySmell, Bladder bladder, Hunger hunger, EnergyLevel energyLevel) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.confidence = confidence;
        this.oralHygiene = oralHygiene; // Default value
        this.bodySmell = bodySmell;
        this.bladder = bladder; // Default value
        this.hunger = hunger; // Default value
        this.energyLevel = energyLevel;

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

    public void setOralHygiene(oralHygiene oralHygiene) {
        this.oralHygiene = oralHygiene;
    }

    public bodySmell getBodySmell() {
        return bodySmell;
    }

    public Hunger getHunger() {
        return hunger;
    }

    public void setHunger(Hunger hunger) {
        this.hunger = hunger;
    }

    public EnergyLevel getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(EnergyLevel energyLevel) {
        this.energyLevel = energyLevel;
    }
}