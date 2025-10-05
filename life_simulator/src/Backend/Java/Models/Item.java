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

    public Item(itemType itemType, boolean isStationary) {
        this.itemType = itemType;
        this.isStationary = isStationary;
    }

    public itemType getItemType() {
        return itemType;
    }

    public boolean isStationary() {
        return isStationary;
    }
}
