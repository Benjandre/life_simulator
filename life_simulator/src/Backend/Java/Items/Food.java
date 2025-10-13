package Items;

import Models.Item;

public class Food extends Item {

    private enum foodType {
        FRUIT,
        VEGETABLE,
        MEAT,
        DAIRY,
        GRAIN,
        SNACK,
        BEVERAGE
    }
    public foodType foodType;
    private String expirationDate;
    public enum foodTreatement {
        RAW,
        COOKED,
        FRIED,
        BAKED
    }
    public foodTreatement foodTreatement;

    public Food(Character itemOwner, itemType itemType, boolean isStationary, foodType foodType, String expirationDate, foodTreatement foodTreatement) {
        super(itemOwner, itemType, isStationary);
        this.foodType = foodType;
        this.expirationDate = expirationDate;
        this.foodTreatement = foodTreatement;
    }

    public foodType getFoodType() {
        return foodType;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public foodTreatement getFoodTreatement() {
        return foodTreatement;
    }
    
}
