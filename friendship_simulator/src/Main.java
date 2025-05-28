import Player_And_Friend.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Player_And_Friend.Player Player = new Player_And_Friend.Player("Ola", "Nordmann", Player_And_Friend.Player.Gender.MALE, 35, 5, Player_And_Friend.Player.Smell.OK);
        Player_And_Friend.Friend Friend = new Player_And_Friend.Friend("Kari", "Nordmann", Player_And_Friend.Friend.Gender.FEMALE, 30);

    }
}
