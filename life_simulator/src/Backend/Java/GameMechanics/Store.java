package GameMechanics;

import Models.Item;
import Rooms.StorageRoom;
import GameMechanics.Inventory;
import GameMechanics.People.StoreOwner;

public class Store {
    
    // Store class to manage items available for purchase
    private StoreOwner StoreOwner;
    private String storeName;
    private StorageRoom storeInventory;
    private Inventory playerInventory;

    public Store(StoreOwner storeOwner, Inventory storeInventory, Inventory playerInventory) {
        this.storeOwner = storeOwner;
        this.storeName = storeName;
        this.storeInventory = storeInventory;
    }

    public String getStoreName() {
        return storeName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void addItemToStore(Item item) {
        inventory.addItem(item);
    }

    public void removeItemFromStore(Item item) {
        inventory.removeItem(item);
    }
    
}
