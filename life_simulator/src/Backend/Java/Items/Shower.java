package Java.Itemsnd.Items;

import GameMechanics.People.mainPlayer;

public class Shower {
    
    String showerName;
    public enum waterTemperature { 
        COLD, 
        WARM, 
        HOT 
    } // Enum for water temperature options
    boolean isWaterRunning; // Indicates if the water is currently running


    public Shower(String showerName) {
        this.showerName = showerName;
    }

    public String getShowerName() {
        return showerName;
    }

    public void turnOnShower() {
        isWaterRunning = true; // Set the water running status to true
    }
    public void turnOffShower() {
        isWaterRunning = false; // Set the water running status to false
    }
}
