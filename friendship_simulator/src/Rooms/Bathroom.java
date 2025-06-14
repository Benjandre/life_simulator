package gameAssets.Places_Rooms_Items.Rooms.Home.Bathroom;

import Models.Room;
import gameAssets.Places_Rooms_Items.Items.Mirror;
import gameAssets.Places_Rooms_Items.Items.Shower;
import gameAssets.Places_Rooms_Items.Items.Toilet;

public class Bathroom extends Room {
    Shower shower;
    Mirror mirror;
    Toilet toilet;

    public Bathroom(String roomName, int roomLength, int roomHeight, roomCleanliness roomCleanliness, Shower shower, Mirror mirror, Toilet toilet) {
        super(roomName, roomLength, roomHeight, roomCleanliness);
    }
}
