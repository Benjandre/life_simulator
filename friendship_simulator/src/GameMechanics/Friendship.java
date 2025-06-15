package GameMechanics;

import gameAssets.Player_And_Friend.Friend.Friend;
import gameAssets.Player_And_Friend.Player.Player;

public class Friendship extends Relationship {

    /* 
    
    This class represents a friendship meter that tracks the level of friendship between the main player and their friends. It starts at 0 and goes to 4. 
    It can increase or decrease based on interactions between the player and their friends.

    Here is an explanation of the friendship levels:
    
    - 0: You don't know the person.
    - 1: You are acquainted with the person.
    - 2: You are friends with the person.
    - 3: You are best friends with the person.
    - 4: You love the person, in a romantic way.
    
    */
    
    private int currentFriendshipLevel;
    public Player player;
    public Friend friend;
    public int MAX_FRIENDSHIP_LEVEL = 4; // Maximum friendship level
    public int MIN_FRIENDSHIP_LEVEL = 0; // Minimum friendship level
    public boolean areFriends;

    public Friendship(Player player, Friend friend) {
        this.player = player;
        this.friend = friend;
        this.currentFriendshipLevel = MIN_FRIENDSHIP_LEVEL; // Initial friendship level
        this.areFriends = true;
    }

    public int getFriendshipLevel() {
        return currentFriendshipLevel;
    }

    // A method which strengthens the friendship between the player and a friend.
    public void strengthenFriendship(Friendship friendship) {
        if (areFriends = true && currentFriendshipLevel != MAX_FRIENDSHIP_LEVEL) {
                currentFriendshipLevel++;
                System.out.println("Your friendship with " + friend.getFirstName() + "" + friend.getLastName() + " strengthened.");
        } else if (currentFriendshipLevel == MAX_FRIENDSHIP_LEVEL) {
            System.out.println("Friendship level is already at maximum.");
            return; // Do not increase if already at max level
        } else {
            System.out.println("You are not friends with " + friend.getFirstName() + "" + friend.getLastName() + ".");
        }
    }

    // A method which weakens the friendship between the player and a friend.
    public void weakenFriendship(Friendship friendship) {
        if (areFriends = true && currentFriendshipLevel != MIN_FRIENDSHIP_LEVEL) {
            currentFriendshipLevel--;
            System.out.println("Your friendship with " + friend.getFirstName() + "" + friend.getLastName() + " weakened.");
        } else {
            System.out.println("You aren't friends with " + friend.getFirstName() + "" + friend.getLastName() + ".");
        }
    }

    // A method which ends the friendship between the player and a friend.
    public void endFriendship(Friend friend) {
        if (areFriends == true) {
                areFriends = false;
                System.out.println("You ended your friendship with " + friend.firstName + "" + friend.getLastName());
            } else {
                System.out.println("You aren't friends with " + friend.firstName + "" + friend.lastName + ".");
            }        
    }

    // A method which checks whether the player is friends with someone or not.
    public void checkIfFriends(Friend friend) {
        if (areFriends == false) {
            System.out.println("You are not friends with" + friend.getFirstName() + "" + friend.getLastName());
        }
        else if (areFriends == true && currentFriendshipLevel )
    }
    
}
