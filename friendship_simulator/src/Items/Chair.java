package Items;

import Models.Player;
import Models.Room;

public class Chair {
    
    public Player player;
    public Room room;

    public Chair(Player player) {
    }

    public Player getPlayer() {
        return player;
    }


    public Room getRoom() {
        return room;
    }

    public void becomeOccupied(Player player) {
        if (this.player == null) {
            this.player = player;
            System.out.println(player.getFirstName() + " sit down on the chair.");
        } else {
            System.out.println("Chair is already occupied.");
        }
    }

    public void becomeVacant(Player player) {
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
            room = room;
            System.out.println("Chair moved to " + room.getRoomName());
        }
        this.room = room;
        System.out.println("Chair moved to " + room.getRoomName());
    }




    
}
