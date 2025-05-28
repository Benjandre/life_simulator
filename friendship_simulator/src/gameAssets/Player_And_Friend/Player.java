package gameAssets.Player_And_Friend;

public class Player {

    public enum Gender {
        FEMALE,
        MALE,
        NON_BINARY
    }

    public enum Smell {
        BAD,
        OK,
        GREAT
    }

    public String firstName;
    public String lastName;
    public Gender gender;
    public int age;
    public int confidence;
    public Smell smell;

    public Player (String firstName, String lastName, Gender gender, int age, int confidence, Smell smell) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.confidence = confidence;
        this.smell = smell;

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

    public Smell getSmell() {
        return smell;
    }

    public void boostConfidence() {
        if (confidence < Integer.MAX_VALUE) {
            confidence++;
        } else {
            throw new IllegalStateException("Confidence is already at maximum value.");
        }
    }
    
}
