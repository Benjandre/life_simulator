package Items;

public class Food extends Item {

    private String foodType; // e.g., "Fruit", "Vegetable", "Meat"
    private String expirationDate; // e.g., "2023-12-31"
    private boolean isCooked; // true if the food is cooked, false if raw

    public Food(String name, String description, int weight, boolean isUsable, String foodType, String expirationDate, boolean isCooked) {
        super(name, description, weight, isUsable);
        this.foodType = foodType;
        this.expirationDate = expirationDate;
        this.isCooked = isCooked;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public boolean isCooked() {
        return isCooked;
    }
    
}
