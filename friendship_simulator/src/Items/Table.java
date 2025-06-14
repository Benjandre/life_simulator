package Items;

public class Table {

    private String material;
    private int numberOfLegs;
    private double length;
    private double width;

    public Table(String material, int numberOfLegs, double length, double width) {
        this.material = material;
        this.numberOfLegs = numberOfLegs;
        this.length = length;
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }    
}
