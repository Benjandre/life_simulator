package Items;

public class toothPaste {

    private String brand;
    private String flavor; // e.g., "Mint", "Cinnamon"
    private boolean isWhitening;
    private boolean containsFluoride;

    public toothPaste(String brand, String flavor, boolean isWhitening, boolean containsFluoride) {
        this.brand = brand;
        this.flavor = flavor;
        this.isWhitening = isWhitening;
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
