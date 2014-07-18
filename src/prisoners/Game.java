
package prisoners;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author stevenwarner
 * @class CSC548
 * 
 */
public class Game {

  
    

    ;

    public static void main(String[] args) {


        //start

        for (int i = 0; i < 10; i++) {

            //creates a random roller

            Random diceRoller = new Random();

            int roll = diceRoller.nextInt(2);




            Random diceRoller2 = new Random();

            int roll2 = diceRoller2.nextInt(2);


            //makes an arraylist of the players
            ArrayList<Player> Results = new ArrayList<Player>();
            //creates the players
            Player playerA = new Player();
            Player playerB = new Player();
            Results.add(playerA);
            Results.add(playerB);
            
            

            playerA.setPlayerNum("one");
            playerB.setPlayerNum("two");

            //creates random moves

            if (roll == 1 && roll2 == 1) {
                playerA.setPayoff(3);
                playerB.setPayoff(3);
            } else if (roll == 1 && roll2 == 0) {
                playerA.setPayoff(5);
                playerB.setPayoff(1);

            } else if (roll == 0 && roll2 == 1) {
                playerA.setPayoff(1);
                playerB.setPayoff(5);

            } else if (roll == 0 && roll2 == 0) {
                playerA.setPayoff(2);
                playerB.setPayoff(2);

            }
            //Print results
            System.out.println(Results);
        }

        //end



    }


}
