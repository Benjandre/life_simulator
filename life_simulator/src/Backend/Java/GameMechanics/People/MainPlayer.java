package GameMechanics.People;

import Models.Character;
import Items.Food;
import Items.Bed;

public class MainPlayer extends Character {

    public MainPlayer (String firstName, String lastName, Gender gender, int age, int confidence, oralHygiene oralHygiene, bodySmell bodySmell, Bladder bladder, Hunger hunger) {
        super(firstName, lastName, gender, age, confidence, oralHygiene, bodySmell, bladder, hunger);
    }

    public void eat(Food food) {
        if (food != null) {
            if (hunger == Hunger.STARVING) {
                hunger = Hunger.HUNGRY;
            } else if (hunger == Hunger.HUNGRY) {
                hunger = Hunger.SATISFIED;
            } else if (hunger == Hunger.SATISFIED) {
                hunger = Hunger.FULL;
            }
        } else {
            System.out.println("You can't eat nothing.");
        }
    }

    public void sleep (Bed bed) {
        if (bed != null) {
            
        }
    }
}
