package Chapter5;
import java.util.Scanner;

/**
 * Program to tally up the votes (yes, no) entered by a user.
 *
 * @author Grace Hopper
 */

public class P5 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);
        
                // prompt the user for a string
        System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
        String userInput = input.next().toUpperCase();
        
        // Define variables
        int yesVotes = 0;
        int noVotes = 0;
        int invalidVotes = 0;
        int totalVotes = 0;
        char x = userInput.charAt(0);
        
        x = userInput.charAt(0);
            if (x == 'Y')
                yesVotes += 1;
            else if (x == 'N')
                noVotes += 1;
            else if (x != 'Q' && x != 'Y' && x != 'N') {
                invalidVotes += 1;
                System.out.print("INVALID CODE: ");
            }

        
        while (x != 'Q'){
            System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
            userInput = input.next().toUpperCase();
            x = userInput.charAt(0);
            if (x == 'Y')
                yesVotes += 1;
            else if (x == 'N')
                noVotes += 1;
            else if (x != 'Q' && x != 'Y' && x != 'N') {
                invalidVotes += 1;
                System.out.print("INVALID CODE: ");
            }
            totalVotes += 1;
            
        }
        
        System.out.println("\nThe voting results are:"
                + "\n\tYes votes:             " + yesVotes + ""
                        + "\n\tNo votes:              " + noVotes + ""
                                + "\n\tInvalid votes:         " + invalidVotes + ""
                                        + "\nTotal Votes"
                                        + "\n\tTotal number of votes: " + totalVotes);
        
        
        
    }    
}

