package gameAssets.Player_And_Friend.Player;

public class Player {

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

    public String firstName;
    public String lastName;
    public Gender gender;
    public oralHygiene oralHygiene;
    public int age;
    public int confidence;
    public bodySmell bodySmell;
    public Bladder bladder;

    public Player (String firstName, String lastName, Gender gender, int age, int confidence, bodySmell bodySmell, Bladder bladder) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.confidence = confidence;
        this.bodySmell = bodySmell;

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

    public bodySmell getBodySmell() {
        return bodySmell;
    }

    public void boostConfidence() {
        if (confidence < Integer.MAX_VALUE) {
            confidence++;
        } else {
            throw new IllegalStateException("Confidence is already at maximum value.");
        }
    }
    
}
