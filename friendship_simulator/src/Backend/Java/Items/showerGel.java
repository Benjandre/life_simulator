package Java.Itemsnd.Items;

public class showerGel {

    private String scent; // e.g., "Lavender", "Citrus"
    private String brand; // e.g., "Dove", "Nivea"
    private boolean isMoisturizing; // true if the gel has moisturizing properties

    public showerGel(String scent, String brand, boolean isMoisturizing) {
        this.scent = scent;
        this.brand = brand;
        this.isMoisturizing = isMoisturizing;
    }

    public String getScent() {
        return scent;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isMoisturizing() {
        return isMoisturizing;
    }
    
}
