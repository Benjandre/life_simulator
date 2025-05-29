package gameAssets.Places_Rooms_Items.Rooms.Home;

public class Room {

    public String roomName;
    public int roomLength;
    public int roomHeight;

    public Room(String roomName, int roomLength, int roomHeight) {
        this.roomName = roomName;
        this.roomLength = roomLength;
        this.roomHeight = roomHeight;
    }

    public String getRoomName() {
        return roomName;
    }
    
}
