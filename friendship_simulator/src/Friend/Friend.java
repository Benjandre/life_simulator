package Friend;

public class Friend {

    public enum Gender {
        FEMALE,
        MALE,
        NON_BINARY
    }
    
    String fristName;
    String lastName;
    int friendAge;

    public Friend(String fristName, String lastName, int friendAge) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.friendAge = friendAge;
    }

    public String getFirstName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFriendAge() {
        return friendAge;
    }
    
}
