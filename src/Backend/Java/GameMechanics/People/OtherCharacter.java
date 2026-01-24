package Backend.Java.GameMechanics.People;

import Backend.Java.Models.Relationship;
import Backend.Java.Models.Relationship.relationshipType;
import Backend.Java.Models.Character;

public class OtherCharacter extends Character {

    public OtherCharacter(String firstName, String lastName, Gender gender, int age, int confidence, oralHygiene oralHygiene, bodySmell bodySmell, Bladder bladder, Hunger hunger, EnergyLevel energyLevel) {
        super(firstName, lastName, gender, age, confidence, oralHygiene, bodySmell, bladder, hunger, energyLevel);
    }

    
}
