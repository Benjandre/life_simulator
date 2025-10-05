package Java.Items;

public class ToothPaste {

    private String brand;
    private String flavor; // e.g., "Mint", "Cinnamon"
    private boolean containsFluoride;

    public toothPaste(String brand, String flavor, boolean containsFluoride) {
        this.brand = brand;
        this.flavor = flavor;
        this.containsFluoride = containsFluoride;
    }

    public String getBrand() {
        return brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public boolean isWhitening() {
        return isWhitening;
    }

    public boolean containsFluoride() {
        return containsFluoride;
    }
    
}
