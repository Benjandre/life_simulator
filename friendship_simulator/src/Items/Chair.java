package Items;

import Models.Item;
import Models.Character;
import Models.Room;

public class Chair extends Item {
    
    public Character player;
    public Room room;

    public Chair(Character player, Room room, itemType itemType, boolean isStationary) {
        super(itemType, isStationary);
        this.player = player;
        this.room = room;
    }

    public Character getPlayer() {
        return player;
    }


    public Room getRoom() {
        return room;
    }

    public void becomeOccupied(Character player) {
        if (this.player == null) {
            this.player = player;
            System.out.println(player.getFirstName() + " sit down on the chair.");
        } else {
            System.out.println("Chair is already occupied.");
        }
    }

    public void becomeVacant(Character player) {
        if (this.player != null) {
            this.player = null;
            System.out.println(this.player.getFirstName() + " stands up from the chair.");
        } else {
            System.out.println("Chair is already vacant.");
        }
    }

    public void checkOccupancyStatus() {
        if (player == null) {
            System.out.println("Chair is vacant.");            
        } else {
            System.out.println("Chair is occupied.");
        }
    }

    public void moveToRoom(Room room) {
        if (this.room == room) {
            System.out.println("Chair is already in " + room.getRoomName());
        } else {
            this.room = room;
            System.out.println("Chair moved to " + room.getRoomName());
        }
    }




    
}
