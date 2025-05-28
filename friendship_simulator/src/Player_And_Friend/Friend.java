package Player_And_Friend;

public class Friend {

    public enum Gender {
        FEMALE,
        MALE,
        NON_BINARY
    }
    
    public String firstName;
    public String lastName;
    public Gender gender;
    public int age;

    public Friend(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
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
