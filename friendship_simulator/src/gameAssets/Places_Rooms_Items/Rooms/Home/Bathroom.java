package gameAssets.Places_Rooms_Items.Rooms;

public class Bathroom extends Room {
    Shower shower;
    Mirror mirror;

    public Bathroom(Shower shower, Mirror mirror) {

        this.shower = shower;
        this.mirror = mirror;
        
    }

    public Shower getShower() {

        return shower;

    }

    public Mirror getMirror() {

        return mirror;

    }
}
