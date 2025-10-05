package Java.Items;

import Java.Models.Item;
import Java.Models.Room;
import Java.GameMechanics.People.mainPlayer;

public class Bed extends Item {
    private String material;
    private String size; // e.g., "Single", "Double", "Queen", "King"
    private boolean hasBedding;

    public Bed(mainPlayer mainPlayer, Room room, itemType itemType, boolean isStationary) {
        super(itemType, isStationary);
        this.mainPlayer = mainPlayer;
        this.room = room;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public boolean hasBedding() {
        return hasBedding;
}
}
