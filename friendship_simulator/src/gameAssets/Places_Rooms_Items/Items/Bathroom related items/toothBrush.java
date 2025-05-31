package gameAssets.Places_Rooms_Items.Items;

public class toothBrush {

    private String brand;
    private String color;
    private boolean isElectric;
    private int bristleHardness; // 1: Soft, 2: Medium, 3: Hard

    public toothBrush(String brand, String color, boolean isElectric, int bristleHardness) {
        this.brand = brand;
        this.color = color;
        this.isElectric = isElectric;
        this.bristleHardness = bristleHardness;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public int getBristleHardness() {
        return bristleHardness;
    }
    
}
