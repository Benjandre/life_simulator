package GameMechanics;

import java.util.ArrayList;

import Models.Item;

public class Inventory {
    
    // Inventory class to manage player's items
    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    public int getItemAmount() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
        if (item.getItemType().toString().toLowerCase().startsWith("a")) {
            System.out.println("You added an " + item.getItemType() + " to your inventory.");
        } else {
            System.out.println("You added a " + item.getItemType() + " to your inventory.");
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
        if (item.getItemType().toString().toLowerCase().startsWith("a")) {
            System.out.println("You removed an " + item.getItemType().toString() + " from your inventory.");
        } else {
            System.out.println("You removed a " + item.getItemType().toString() + " from your inventory.");
        }
    }

    public void clearInventory() {
        if (items.isEmpty()) {
            System.out.println("You can't clear your inventory, since you don't have any items.");
        } else {
            items.clear();
            System.out.println("You cleared your inventory.");
        }
    }
}
