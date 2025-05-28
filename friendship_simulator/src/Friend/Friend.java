package Friend;

public class Friend {

    public enum Gender {
        FEMALE,
        MALE,
        NON_BINARY
    }
    
    String firstName;
    String lastName;
    int friendAge;

    public Friend(String firstName, String lastName, int friendAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.friendAge = friendAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFriendAge() {
        return friendAge;
    }
    
}
