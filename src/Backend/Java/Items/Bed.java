package Backend.Java.Items;

import Backend.Java.Models.Item;
import Backend.Java.Models.Room;
import Backend.Java.GameMechanics.People.MainPlayer;

public class Bed extends Item {

    private MainPlayer mainPlayer;
    private Room room;

    public Bed(MainPlayer mainPlayer, Room room, Item.itemType itemType, boolean isStationary) {
        super(itemType, isStationary);
        this.mainPlayer = mainPlayer;
        this.room = room;
    }
}
