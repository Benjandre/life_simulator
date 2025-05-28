package Player_And_Friend;

public class Friend extends Player {


    public Friend(String firstName, String lastName, Gender gender, int age, int confidence, Smell smell) {
        super(firstName, lastName, gender, age, confidence, smell);
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
    
}
