package Places;

import Models.Place;

public class Cafe extends Place {

    public Cafe() {
        super("Cafe", "A cozy place to relax and enjoy a cup of coffee.", "Public");
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", locationType='" + getLocationType() + '\'' +
                '}';
    }


    
}
