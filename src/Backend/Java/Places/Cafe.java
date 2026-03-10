package Backend.Java.Places;

import Backend.Java.Models.Place;
import Backend.Java.Models.Room;
import Backend.Java.Items.Table;
import Backend.Java.Models.Character;
import Backend.Java.Items.Chair;

public class Cafe extends Place {
    
    private enum cafeTidiness {
        TIDY,
        SOMEWHAT_TIDY,
        DIRTY
    }

    boolean isOpen;
    private Character worker;
    private Room room;
    private Table table;
    private Chair chair;


    public Cafe() {
        super("Cafe", "A cafe.", Place.LocationType.CAFE);
    }

    public cafeTidiness getCafeTidiness() {
        return cafeTidiness;
    }

    public Room getRoom() {
        return room;
    }

    public Table getTable() {
        return table;
    }

    public Chair getChair() {
        return chair;
    }

    public void OpenCafe() {
        if (isOpen == true) {
            System.out.println("The cafe is already open.");
            return;
        } else {
            isOpen = true;
            System.out.println("The cafe is now open.");
        }
    }

    public void CloseCafe() {
        if (isOpen == false) {
            System.out.println("The cafe is already closed.");
            return;
        } else {
            isOpen = false;
            System.out.println("The cafe is now closed.");
        }
        isOpen = false;
    }

    public void tidyCafe() {
        if (cafeTidiness == cafeTidiness.TIDY) {
            System.out.println("The cafe is already clean, so there is no need to clean it further.");
        } else if (cafeTidiness == cafeTidiness.SOMEWHAT_TIDY) {
            System.out.println("The cafe is somewhat clean. Would you like to clean it further?");
            // Add functionality for cleaing it.
        } else {
            System.out.println("The cafe is dirty. Would you like to clean it?");
            // Add functionality for cleaing it.
        }
    }

    
}
