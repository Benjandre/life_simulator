package GameMechanics.TimeManagement;

public class Turn {

    private int turnNumner;
    private boolean isTurnActive;

    public Turn (int turnNumner, boolean isTurnActive) {
        this.turnNumner = turnNumner;
        this.isTurnActive = isTurnActive;
    }

    public int getTurnNumber() {
        return turnNumner;
    }

    public boolean isTurnActive() {
        return isTurnActive;
    }

    public void startTurn() {
        if (isTurnActive == false) {
            isTurnActive = true;
            System.out.println("A new turn has started.");
        } else {
            System.out.println("You can't start a new turn, while another one hasn't ended, yet.");
        }
    }

    public void endTurn() {
        if (isTurnActive == true) {
            isTurnActive = false;
            turnNumner++;
            System.out.println("The turn has ended.");
        } else {
            System.out.println("The turn is still going.");
        }
    }
}
