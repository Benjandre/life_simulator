package Items;

import GameMechanics.People.MainPlayer;

public class ToothBrush {
    
    public enum ToothBrushType {
        ELECTRIC,
        REGULAR
    }

    public enum ToothBrushDurability {
        NEW,
        USED,
        WORN_OUT
    }

    private Character owner;
    private ToothBrushType ToothBrushType;
    private ToothBrushDurability ToothBrushDurability;

    public ToothBrush(Character owner) {
        this.owner = owner;
    }

    public Character getOwner() {
        return owner;
    }

    public ToothBrushType getToothBrushType() {
        return ToothBrushType;
    }

    public ToothBrushDurability getToothBrushDurability() {
        return ToothBrushDurability;
    }
}
