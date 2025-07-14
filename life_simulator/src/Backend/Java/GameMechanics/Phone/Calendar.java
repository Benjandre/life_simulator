package GameMechanics.Phone;

public class Calendar {

    private String date;
    private String event;

    // Constructor
    public Calendar(String date, String event) {
        this.date = date;
        this.event = event;
    }

    // Getters
    public String getDate() {
        return date;
    }

    public String getEvent() {
        return event;
    }

    // Setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setEvent(String event) {
        this.event = event;
    }
    
}
