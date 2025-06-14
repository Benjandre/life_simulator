package gameAssets.Places_Rooms_Items.Items;

public class Bed {
        
    private String type;
    private String size;
    private String material;
    private boolean isMade;

    public Bed(String type, String size, String material) {
        this.type = type;
        this.size = size;
        this.material = material;
        this.isMade = false; // Bed is initially not made
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isMade() {
        return isMade;
    }

    public void makeBed() {
        isMade = true; // Set the bed as made
    }

    public void unmakeBed() {
        isMade = false; // Set the bed as not made
    }
}
