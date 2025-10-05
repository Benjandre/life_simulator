package Items;

import GameMechanics.People.MainPlayer;

public class ToothBrush {
    
    public enum ToothBrushType {
        ELECTRIC,
        REGULAR
    }

    private Character owner;
    private ToothBrushType ToothBrushType;

    public ToothBrush(Character owner) {
        this.owner = owner;
    }

    public Character getOwner() {
        return owner;
    }

    public ToothBrushType getToothBrushType() {
        return ToothBrushType;
    }
}
