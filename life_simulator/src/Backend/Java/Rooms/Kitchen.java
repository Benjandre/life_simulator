package Java.Rooms;

public class Kitchen extends Room {

    public Kitchen(String roomName, int roomLength, int roomHeight, roomCleanliness roomCleanliness) {
        super(roomName, roomLength, roomHeight, roomCleanliness);
    }

    // Additional methods specific to Kitchen can be added here
    // For example, methods to manage kitchen appliances or cooking items can be implemented
    public void cook(String dish) {
        System.out.println("Cooking " + dish + " in the kitchen.");
    }
    
}
