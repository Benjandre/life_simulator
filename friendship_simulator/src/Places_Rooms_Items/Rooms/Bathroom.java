package Places_And_Rooms.Rooms;

public class Bathroom {
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
