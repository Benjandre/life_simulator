package Java.Places;

public class Park extends Place {

    private String parkName;
    private String locationType;
    private String description;

    public Park(String parkName, String description, String locationType) {
        super(parkName, description, locationType);
        this.parkName = parkName;
        this.description = description;
        this.locationType = locationType;
    }

    public String getParkName() {
        return parkName;
    }

    public String getDescription() {
        return description;
    }

    public String getLocationType() {
        return locationType;
    }
    
}
