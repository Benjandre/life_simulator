package Items;

import Models.Character;
import Models.Item;
import Models.Room;
import GameMechanics.People.MainPlayer;

public class Chair extends Item {
    
    private MainPlayer mainPlayer;
    private Room room;

    public Chair(Character itemOwner, MainPlayer mainPlayer, Room room, Item.itemType itemType, boolean isStationary) {
        super(itemOwner, itemType, isStationary);
        this.mainPlayer = mainPlayer;
        this.room = room;
    }

    public MainPlayer getPlayer() {
        return mainPlayer;
    }


    public Room getRoom() {
        return room;
    }

    public void becomeOccupied(MainPlayer mainPlayer) {
        if (this.mainPlayer != null) {
            this.mainPlayer = mainPlayer;
            System.out.println(mainPlayer.getFirstName() + " sits down on the chair.");
        } else {
            System.out.println("Chair is already occupied.");
        }
    }

    public void becomeVacant() {
        if (this.mainPlayer != null) {
            System.out.println(this.mainPlayer.getFirstName() + " stands up from the chair.");
            this.mainPlayer = null;
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
        if (room == null) {
            System.out.println("Invalid room. Cannot move chair.");
            return;
            
        }
        if (this.room == room) {
            System.out.println("Chair is already in " + room.getRoomName());
        } else {
            this.room = room;
            System.out.println("Chair moved to " + room.getRoomName());
        }
    }



    
}
