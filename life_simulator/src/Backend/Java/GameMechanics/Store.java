package GameMechanics;

import Models.Item;
import Rooms.StorageRoom;
import GameMechanics.Inventory;
import GameMechanics.People.storeOwner;

public class Store {
    
    // Store class to manage items available for purchase
    private storeOwner storeOwner;
    private String storeName;
    private StorageRoom storeInventory;
    private Inventory playerInventory;

    public Store(storeOwner storeOwner, Inventory storeInventory, Inventory playerInventory) {
        this.storeOwner = storeOwner;
        this.storeName = storeName;
        this.storeInventory = storeInventory;
    }

    public String getStoreName() {
        return storeName;
    }

    public void removeItemFromStore() {
        storeInventory.
    }
    
}
