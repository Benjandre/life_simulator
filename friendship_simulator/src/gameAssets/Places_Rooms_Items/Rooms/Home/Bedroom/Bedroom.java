package gameAssets.Places_Rooms_Items.Rooms.Home.Bedroom;

import gameAssets.Places_Rooms_Items.Rooms.Home.Room;

public class Bedroom extends Room {

    public Bedroom(String roomName, int roomLength, int roomHeight, roomCleanliness roomCleanliness) {
        super(roomName, roomLength, roomHeight, roomCleanliness);
    }

    // Additional methods specific to Bedroom can be added here
    // For example, methods to manage bedroom items or sleep routines can be implemented
    public void sleep() {
        System.out.println("You lie down and go to sleep in the " + getRoomName() + ".");
    }
    
}
