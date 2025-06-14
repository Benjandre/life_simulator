package gameAssets.Places_Rooms_Items.Items.Livingroom.General_classes;

public class Chair {
    
    private String material;
    private String color;
    private boolean isOccupied;

    public Chair(String material, String color) {
        this.material = material;
        this.color = color;
        this.isOccupied = false;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy() {
        this.isOccupied = true;
    }

    public void vacate() {
        this.isOccupied = false;
    }
    
}
