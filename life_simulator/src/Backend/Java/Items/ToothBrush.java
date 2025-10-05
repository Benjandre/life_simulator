package Items;

import GameMechanics.People.MainPlayer;

public class ToothBrush {

    private Character owner;

    public ToothBrush(Character owner) {
        this.owner = owner;
    }

    public Character getOwner() {
        return owner;
    }

    public void brushTeeth() {
        // Example implementation: print a message
        if (owner != null) {
            System.out.println(owner.getFirstName() + " is brushing their teeth.");
        } else {
            System.out.println("No owner assigned to this toothbrush.");
        }
    }
}
