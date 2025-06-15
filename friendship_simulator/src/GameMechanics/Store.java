package GameMechanics;

import Models.Item;
import GameMechanics.Inventory;

public class Store {
    
    // Store class to manage items available for purchase
    private String storeName;
    private Inventory inventory;

    public Store(String storeName) {
        this.storeName = storeName;
        this.inventory = new Inventory();
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
