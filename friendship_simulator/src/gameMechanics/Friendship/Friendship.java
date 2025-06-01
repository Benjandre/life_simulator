package gameMechanics.Friendship;

import gameAssets.Player_And_Friend.Friend.Friend;
import gameAssets.Player_And_Friend.Player.Player;

public class Friendship {

    /* 
    
    This class represents a friendship meter that tracks the level of friendship between the main player and their friends. It starts at 0 and goes to 5. 
    It can increase or decrease based on interactions between the player and their friends.
    
    */
    
    private int currentFriendshipLevel;
    public Player player;
    public Friend friend;
    public int MAX_FRIENDSHIP_LEVEL = 5; // Maximum friendship level
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

    public void strengthenFriendship(Friendship friendship) {
        try {
            if (areFriends = true && currentFriendshipLevel != MAX_FRIENDSHIP_LEVEL) {
                currentFriendshipLevel++;
                System.out.println("Your friendship with " + friend.getFirstName() + "" + friend.getLastName() + " increased.");
        } else if (currentFriendshipLevel == MAX_FRIENDSHIP_LEVEL) {
            System.out.println("Friendship level is already at maximum.");
            return; // Do not increase if already at max level
        } else {
            System.out.println("You are not friends with " + friend.getFirstName() + "" + friend.getLastName() + ".");
        }} catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        }
    }

    public void weakenFriendship(Friendship friendship) {
        try {
            if (areFriends = true && currentFriendshipLevel != MIN_FRIENDSHIP_LEVEL) {
                currentFriendshipLevel--;
                System.out.println("Your friendship with " + friend.getFirstName() + "" + friend.getLastName() + " weakened.");
            } else {
                System.out.println("You aren't friends with " + friend.getFirstName() + "" + friend.getLastName() + ".");
            }} catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        }
    }

    public void endFriendship(Friend friend) {
        try {
            if (areFriends == true) {
                areFriends = false;
                System.out.println("You ended your friendship with " + friend.firstName + "" + friend.getLastName());
            } else {
                System.out.println("You aren't friends with " + friend.firstName + "" + friend.lastName + ".");
            }
        } catch (Exception exception) {
            System.out.println("An unexpected error occurred: " + exception.getMessage());
        }
        
    }
    
}
