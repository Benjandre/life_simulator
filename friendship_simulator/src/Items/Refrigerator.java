package Items;

import java.util.ArrayList;

import Models.Item;

public class Refrigerator extends Item {

    private String refrigeratorName;
    private int currentCapacity;
    private ArrayList<Food> refrigerator;

    public Refrigerator(itemType itemType, boolean isStationary, String refrigeratorName, int currentCapacity) {
        super(itemType,isStationary);
        this.refrigeratorName = refrigeratorName;
        this.currentCapacity = currentCapacity;
        refrigerator = new ArrayList<>();
    }

    public int getCurrentCapasity() {
        return currentCapacity;
    }

    public void addFood(Food food) {
        refrigerator.add(food);
        System.out.println("Added " + food.getFoodType() + " to the refrigerator.");
    }

    public void removeFood(Food food) {
        if (refrigerator.contains(food)) {
            refrigerator.remove(food);
            System.out.println("Removed " + food.getFoodType() + " from the refrigerator.");
        } else {
            System.out.println("Food not found in the refrigerator.");
        }
    }

    public void listFood() {
        if (refrigerator.isEmpty()) {
            System.out.println("The refrigerator is empty.");
        } else {
            System.out.println("Food items in the refrigerator:");
            for (Food food : refrigerator) {
                System.out.println("- " + food.getFoodType() + " (Cooked: " + food.isCooked() + ")");
            }
        }
    }

    public void emptyRefrigerator() {
        if (!refrigerator.isEmpty()) {
            refrigerator.clear();
            System.out.println("The refrigerator has been emptied.");
        } else {
            System.out.println("The refrigerator doesn't contain any food.");
        }        
    }
    
}
