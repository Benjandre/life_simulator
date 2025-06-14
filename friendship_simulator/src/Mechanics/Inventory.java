package gameMechanics.Inventory;

public class Inventory {
    
    // Inventory class to manage player's items
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }
}
