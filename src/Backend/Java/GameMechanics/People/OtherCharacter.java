package GameMechanics.People;

import Models.Relationship;
import Models.Relationship.relationshipType;
import Models.Character;

public class OtherCharacter extends Character {

    public OtherCharacter(String firstName, String lastName, Gender gender, int age, int confidence, oralHygiene oralHygiene, bodySmell bodySmell, Bladder bladder, Hunger hunger, EnergyLevel energyLevel) {
        super(firstName, lastName, gender, age, confidence, oralHygiene, bodySmell, bladder, hunger, energyLevel);
    }

    
}
