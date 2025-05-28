import gameAssets.Player_And_Friend.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Player_And_Friend.Player Player = new Player_And_Friend.Player("Ola", "Nordmann", gameAssets.Player_And_Friend.Player.Gender.MALE, 35, 5, gameAssets.Player_And_Friend.Player.Smell.OK);
        Player_And_Friend.Friend Friend = new Player_And_Friend.Friend("Kari", "Nordmann", gameAssets.Player_And_Friend.Friend.Gender.FEMALE, 30);

    }
}
