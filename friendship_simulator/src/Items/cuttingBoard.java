package Items;

public class cuttingBoard extends Item {

    private String material; // e.g., wood, plastic, bamboo
    private String size; // e.g., small, medium, large
    private boolean isClean; // Indicates if the cutting board is clean

    public cuttingBoard(String material, String size) {
        super("Cutting Board", "A board for cutting food items.", 500, true);
        this.material = material;
        this.size = size;
        this.isClean = true; // Cutting board is initially clean
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public boolean isClean() {
        return isClean;
    }

    public void cleanBoard() {
        isClean = true; // Set the cutting board as clean
    }

    public void dirtyBoard() {
        isClean = false; // Set the cutting board as dirty
    }
    
}
