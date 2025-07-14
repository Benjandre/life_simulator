package Java.Itemsnd.Items;

import Backend.Models.Item;
import Backend.Models.Room;
import GameMechanics.People.mainPlayer;

public class Chair extends Item {
    
    public mainPlayer mainPlayer;
    public Room room;

    public Chair(mainPlayer mainPlayer, Room room, itemType itemType, boolean isStationary) {
        super(itemType, isStationary);
        this.mainPlayer = mainPlayer;
        this.room = room;
    }

    public mainPlayer getPlayer() {
        return mainPlayer;
    }


    public Room getRoom() {
        return room;
    }

    public void becomeOccupied(mainPlayer mainPlayer) {
        if (this.mainPlayer == null) {
            this.mainPlayer = mainPlayer;
            System.out.println(mainPlayer.getFirstName() + " sit down on the chair.");
        } else {
            System.out.println("Chair is already occupied.");
        }
    }

    public void becomeVacant(mainPlayer mainPlayer) {
        if (this.mainPlayer != null) {
            this.mainPlayer = null;
            System.out.println(this.mainPlayer.getFirstName() + " stands up from the chair.");
        } else {
            System.out.println("Chair is already vacant.");
        }
    }

    public void checkOccupancyStatus() {
        if (mainPlayer == null) {
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
