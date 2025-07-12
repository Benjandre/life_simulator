package GameMechanics.Turn;

public class Turn {

    private int turnNumner;
    private boolean isTurnOver;

    public Turn (int turnNumner, boolean isTurnOver) {
        this.turnNumner = turnNumner;
        this.isTurnOver = isTurnOver;
    }

    public int getTurnNumber() {
        return turnNumner;
    }

    public boolean isTurnOver() {
        return isTurnOver;
    }

    public void startTurn() {
        if (isTurnOver == true) {
            isTurnOver = false;
            System.out.println("A new turn has started.");
        } else {
            System.out.println("You can't start a new turn, while another one hasn't ended, yet.");
        }
    }

    public void endTurn() {
        if (isTurnOver == false) {
            isTurnOver = true;
            turnNumner++;
            System.out.println("The turn has ended.");
        } else {
            System.out.println("The turn is still going.");
        }
    }
}
