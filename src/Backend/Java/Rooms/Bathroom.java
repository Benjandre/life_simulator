package Backend.Java.Rooms;

import Backend.Java.Models.Room;
import Backend.Java.Items.Mirror;
import Backend.Java.Items.Shower;
import Backend.Java.Items.Toilet;

public class Bathroom extends Room {
    Shower shower;
    Mirror mirror;
    Toilet toilet;

    public Bathroom(String roomName, int roomLength, int roomHeight, roomCleanliness roomCleanliness, Shower shower, Mirror mirror, Toilet toilet) {
        super(roomName, roomLength, roomHeight, roomCleanliness);
    }
}
