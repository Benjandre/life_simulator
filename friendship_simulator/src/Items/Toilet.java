package Items;

public class Toilet {
    
    private String toiletType;
    private boolean isClean;

    public Toilet(String toiletType, boolean isClean) {
        this.toiletType = toiletType;
        this.isClean = isClean;
    }

    public String getToiletType() {
        return toiletType;
    }

    public boolean isClean() {
        return isClean;
    }

    public void cleanToilet() {
        this.isClean = true;
    }

    public void dirtyToilet() {
        this.isClean = false;
    }
}
