package Models;

public class Place {

    public enum LocationType {
        CAFE,
        HOME,
        PARK
    }
    
    private String name;
    private String description;
    private LocationType locationType;

    public Place(String name, String description, LocationType locationType) {
        this.name = name;
        this.description = description;
        this.locationType = locationType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocationType getLocationType() {
        return locationType;
    }
}
