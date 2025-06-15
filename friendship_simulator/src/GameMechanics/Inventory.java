package GameMechanics;

import java.util.ArrayList;

import Models.Item;

public class Inventory {
    
    // Inventory class to manage player's items
    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }
}
