import Friend.Friend;
import Player.Player.Gender;
import Player.Player.Smell;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Player.Player firstPlayer = new Player.Player("Ola", "Nordmann", Gender.MALE, 35, 5, Smell.OK);
        Friend.Friend firstFriend = new Friend.Friend("Kari", "Nordmann", Gender.FEMALE, 30);

    }
}
