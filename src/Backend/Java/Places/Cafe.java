package Backend.Java.Places;

import Backend.Java.Models.Place;
import Backend.Java.Models.Room;
import Backend.Java.Items.Table;
import Backend.Java.Models.Character;
import Backend.Java.Items.Chair;

public class Cafe extends Place {
    
    boolean isOpen;
    private Character worker;
    private Room room;
    private Table table;
    private Chair chair;


    public Cafe() {
        super("Cafe", "A cafe.", Place.LocationType.CAFE);
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
        isOpen = false;
    }

    
}
