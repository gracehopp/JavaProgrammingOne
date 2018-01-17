package Chapter3;
import java.util.Scanner; 
/**
 * This program uses if statements for a user interface "Heads or Tails" coin flip game
 *
 * @author Grace Hopper
 */

public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

         

        // Declare Variables 

        String coin; 

        String answer; 

         

        // Generates a random number (1, 0) 

        int randomNumber = (int)(Math.random()*2); 

         

        // Define coin 

        if (randomNumber == 0){ 

            coin = "tails"; 

        } 

        else { 

            coin = "heads"; 

        } 

         

        // Ask for user input 

        System.out.print("Type heads or tails >> "); 

        String guess = input.next(); 

         

        // Score user's guess and output the answer 

        if ((guess).equals(coin)){ 

            System.out.println("The coin was flipped to "  

                    + coin + ". You win!"); 

        } 

        else { 

            System.out.println("Sorry, you lose. The coin was flipped to "  

                    + coin); 

        } 
    }
}
