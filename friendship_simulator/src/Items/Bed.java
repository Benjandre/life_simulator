package Items;

import GameMechanics.People.mainPlayer;
import Models.Item;
import Models.Room;

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
