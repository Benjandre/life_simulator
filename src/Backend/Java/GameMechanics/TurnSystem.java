package GameMechanics;

public class TurnSystem {
    
    /* 
    This class represents the turn system in the game. Each action the player takes is considered a turn. A action can be anything from sending
    a message to a friend, visiting a place, or performing an activity.
    */
    
    private int turnNumber;
    private boolean isPlayerTurn;

    public turnSystem(int turnNumber, boolean isPlayerTurn) {
        this.turnNumber = turnNumber;
        this.isPlayerTurn = isPlayerTurn;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        isPlayerTurn = playerTurn;
    }

    public void endTurn() {
        if (isPlayerTurn) {
            isPlayerTurn = false; // End the player's turn
        } else {
            return;
        }
    }

    public void nextTurn() {
        if (isPlayerTurn) {
        turnNumber++;
        endTurn();
        }
        else {
            return;
        }
    }
    
}
