package gameAssets.Places_Rooms_Items.Items.Bathroom.General_classes;

public class Faucet {

    private String type; // e.g., "Kitchen", "Bathroom"
    private String material; // e.g., "Stainless Steel", "Brass"
    private boolean isHotWaterAvailable;
    private boolean isColdWaterAvailable;

    public Faucet(String type, String material, boolean isHotWaterAvailable, boolean isColdWaterAvailable) {
        this.type = type;
        this.material = material;
        this.isHotWaterAvailable = isHotWaterAvailable;
        this.isColdWaterAvailable = isColdWaterAvailable;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isHotWaterAvailable() {
        return isHotWaterAvailable;
    }

    public boolean isColdWaterAvailable() {
        return isColdWaterAvailable;
    }
    
}
