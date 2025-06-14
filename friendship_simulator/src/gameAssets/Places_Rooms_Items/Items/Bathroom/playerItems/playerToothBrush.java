package gameAssets.Places_Rooms_Items.Items.Bathroom_related_items.Player's_items;

import gameAssets.Places_Rooms_Items.Items.Bathroom.General_classes.toothBrush;
import gameAssets.Player_And_Friend.Player.Player;

public class playerToothBrush extends toothBrush {

    public playerToothBrush(Player owner) {
        super(owner);
    }

    public void useToothBrush() {
        if (owner.oralHygiene == owner.oralHygiene.BAD) {
            System.out.println("You brush your teeth with your toothbrush.");
            owner.oralHygiene = owner.oralHygiene.OK; // Improves oral hygiene
            System.out.println("Your oral hygiene has improved to OK.");
        } else if (owner.oralHygiene == owner.oralHygiene.OK) {
            System.out.println("You brush your teeth with your toothbrush.");
            owner.oralHygiene = owner.oralHygiene.GOOD; // Further improves oral hygiene
            System.out.println("Your oral hygiene has improved to GOOD.");
        } else {
            System.out.println("Your teeth are already in great condition!");
            
        }
    }
    
}
