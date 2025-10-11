package GameMechanics.People;

import Models.Character;
import Items.Food;
import Items.Bed;
import Items.Chair;
import Items.ToothBrush;

public class MainPlayer extends Character {

    public MainPlayer (String firstName, String lastName, Gender gender, int age, int confidence, oralHygiene oralHygiene, bodySmell bodySmell, Bladder bladder, Hunger hunger, EnergyLevel energyLevel) {
        super(firstName, lastName, gender, age, confidence, oralHygiene, bodySmell, bladder, hunger, energyLevel);
    }

    public void eat(Food food) {
        if (food != null) {
            System.out.println("You ate some " + food.getFoodType() + ".");
            if (getHunger() == Hunger.STARVING) {
                setHunger(Hunger.HUNGRY);
            } else if (getHunger() == Hunger.HUNGRY) {
                setHunger(Hunger.SATISFIED);
            } else if (getHunger() == Hunger.SATISFIED) {
                setHunger(Hunger.FULL);
            }
        } else {
            System.out.println("You have to eat something, if you want to eat.");
        }
    }

    // Consider making this so, that it always fully rests you.
    // Also, make it so, that you need to be "exausted" or "tired", for sleeping.
    // Consider adding a "wake up" method to this.
    public void sleep(Bed bed) {
        if (bed != null) {
            System.out.println("You sleep in the bed.");
            if (getEnergyLevel() == EnergyLevel.EXAUSTED) {
                setEnergyLevel(EnergyLevel.TIRED);
            } else if (getEnergyLevel() == EnergyLevel.TIRED) {
                setEnergyLevel(EnergyLevel.MODERATE);
            } else if (getEnergyLevel() == EnergyLevel.MODERATE) {
                setEnergyLevel(EnergyLevel.ENERGETIC);
            }
        } else {
            System.out.println("You need a bed to sleep.");
        }
    }

    public void sit(Chair chair) {
        if (chair != null) {
            System.out.println("You sat down.");
            if (condition) {
                
            }
        }
    }

    public void brushTeeth(ToothBrush ToothBrush) {
        if (ToothBrush != null) {
            System.out.println("You brushed your teeth.");
            if (getOralHygiene() == oralHygiene.BAD) {
                setOralHygiene(oralHygiene.OK);
            } else if (getOralHygiene() == oralHygiene.OK) {
                setOralHygiene(oralHygiene.GOOD);
        } else {
            System.out.println("You need a toothbrush to brush your teeth.");
        }
    }
}
