package Models;

public class Item {
    public enum itemType
    {
        Bed,
        Chair,
        Table,
        Toothbrush,
        Toothpaste,
        Showergel,
        Wallet,
        Knife,
        Refrigerator,
        Faucet,
        Mirror,
        Shower,
        Toilet,
        Mobilephone,
        Food
    }

    private Character itemOwner;  
    private itemType itemType;
    private boolean isStationary; // true if the item is stationary, false if it can be moved

    public Item(Character itemOwner, itemType itemType, boolean isStationary) {
        this.itemOwner = itemOwner;
        this.itemType = itemType;
        this.isStationary = isStationary;
    }

    public Item(String name, String description, int weight, boolean isUsable) {
        //TODO Auto-generated constructor stub
    }

    public Character getItemOwner() {
        return itemOwner;
    }

    public itemType getItemType() {
        return itemType;
    }

    public boolean isStationary() {
        return isStationary;
    }
}
