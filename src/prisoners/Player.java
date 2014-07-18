
package prisoners;

/**
 *
 * @author stevenwarner
 * @class CSC548
 * 
 */
public class Player {
    //whether player stays silent or not
    private boolean move;
    //int for how many years of jail the player gets
    public int payoff;
    //determines what player number each player is
    public String playerNum;

    
    
    //getters and setters for variables
    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public int getPayoff() {
        return payoff;
    }

    public void setPayoff(int payoff) {
        this.payoff = payoff;
    }

    public String getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(String playerNum) {
        this.playerNum = playerNum;
    }
   

    //constructor
    public Player(boolean move, int payoff, String playerNum) {
        this.move = move;
        this.payoff = payoff;
        this.playerNum = playerNum;
    }
    
    //default constructor
    public Player() {
    }
    
    //override meathod for player
@Override
    public String toString() {
        return "Player " + playerNum + " gets " + payoff + " years in jail";
    }
    
        }
    

