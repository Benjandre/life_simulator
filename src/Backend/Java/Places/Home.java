package Java.Places;

import Models.Place;
import Models.Room;

public class Home extends Place {

    private String address;
    private Room room;
    private boolean hasGarden;

    public Home(String name, String description, String locationType, String address, int numberOfRooms, boolean hasGarden) {
        super(name, description, locationType);
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.hasGarden = hasGarden;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

}
