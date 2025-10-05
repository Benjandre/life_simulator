package Models;

import java.util.Scanner;

public class Room {

    public enum roomCleanliness {
        CLEAN, 
        DIRTY,
        DUSTY
    }

    private String roomName;
    private int roomLength;
    private int roomHeight;
    private roomCleanliness roomCleanliness;

    public Room(String roomName, int roomLength, int roomHeight, roomCleanliness roomCleanliness) {
        this.roomName = roomName;
        this.roomLength = roomLength;
        this.roomHeight = roomHeight;
        this.roomCleanliness = roomCleanliness;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getRoomLength() {
        return roomLength;
    }
    public int getRoomHeight() {
        return roomHeight;
    }
    public roomCleanliness getRoomCleanliness() {
        return roomCleanliness;
    }

    public void vacuumRoom() {

        if (roomCleanliness == roomCleanliness.DIRTY) {
            System.out.println("The room is dirty. Cleaning is necessary.");
            System.out.println("Do you want to clean the room first? (yes/no)");
            Scanner dirtyScanner = new Scanner(System.in);
            String response = dirtyScanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                cleanRoom(); // Call the cleanRoom method to clean the room
            } else if (response.equals("no")) {
                System.out.println("You chose not to clean the room. It will remain dirty.");
                return; // Exit if the user chooses not to clean
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                return; // Exit if the response is invalid
            }
        } else if (roomCleanliness == roomCleanliness.DUSTY) {
            System.out.println("You vacuum the room to remove dust.");
            roomCleanliness = roomCleanliness.CLEAN; // Set the room to clean after vacuuming
        } else {
            System.out.println("The room is clean. No need to vacuum.");
            return; // Exit if the room is clean           
        }
    }

    public static void cleanRoom(Room room) {
        if (roomCleanliness == roomCleanliness.DIRTY) {
            System.out.println("You clean the room.");
            roomCleanliness = roomCleanliness.CLEAN; // Set the room to clean after cleaning
        } else if (roomCleanliness == roomCleanliness.CLEAN) {
            System.out.println("The room is already clean. No need to clean.");
        } else {
            System.out.println("The room is dusty. You can vacuum it to remove dust.");
        }
    }
    
}
