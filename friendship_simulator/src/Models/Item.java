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
        Mobilephone
    }

    public Player itemOwner;    
    private itemType itemType;
    private boolean isUsable;

    public Item(itemType itemType, boolean isUsable) {
        this.itemType = itemType;
        this.isUsable = isUsable;
    }

    public itemType getItemType() {
        return itemType;
    }

    public boolean isUsable() {
        return isUsable;
    }
}
