package Items;

import gameAssets.Player_And_Friend.Player.Player;

public class toothBrush {

    public Player owner;

    public toothBrush(Player owner) {
        this.owner = owner;
    }

    public Player getOwner() {
        return owner;
    }
}
