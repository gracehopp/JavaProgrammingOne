package Chapter5;
import java.util.*; 
/**
 * This program uses a randomized value to play a game of rock paper scissors with a user.
 *
 * @author Grace Hopper
 */

public class C5_34 { 
/**
    * Main Method
    * 
    * @param args arguments from command line prompt
    */
public static void main(String[] args){ 

     

    // define imported values 

    Scanner input = new Scanner(System.in); 

    Random rand = new Random(); 

    int myrandnum = rand.nextInt(); 

     

    int computerWins = 0; 

    int userWins = 0; 

     

    while (computerWins < 2 && userWins < 2){ 

    // Ask the user to enter either rock, paper, or scissors 

    System.out.print("\nEnter rock, paper, or scissors: "); 

    String userChoice = input.next().toLowerCase(); 

    int choice = 0; 

    switch (userChoice) { 

            case "rock": choice = 1; 

            break; 

            case "paper": choice = 2; 

            break; 

            case "scissors": choice = 3; 

            break; 

            default: choice = 10; 

    } 

     

    // ensure that the input was correct 

    if (choice == 10) { 

        System.out.println("Invalid input"); 

    } 

     

    else { 

         

        // define variables 

        boolean winOrLose = false; 

         

            // Define computer input variables and generate rock, paper, or scissors 

        String computerChoice = ""; 

        int computerNumber = (int)(Math.random()*3); 

        computerNumber = computerNumber + 1; 

        switch (computerNumber) { 

                case 1: computerChoice = "rock"; 

                break; 

                case 2: computerChoice = "paper"; 

                break; 

                case 3: computerChoice = "scissors"; 

        } 

     

        System.out.println("The computer chose " + computerChoice 

                + " and you chose " + userChoice + "."); 

     

         

        // compute the round result 

        if (computerNumber == choice) { 

                System.out.println("Tie!"); 

            computerWins -= 1; 

        } 

     

        if (computerNumber == 1) { 

            if (choice == 2) 

                winOrLose = true; 

            else if (choice == 3) 

                winOrLose = false; 

        } 

     

        else if (computerNumber == 2) { 

            if (choice == 1) 

                winOrLose = false; 

            else if (choice == 3) 

                winOrLose = true; 

        } 

     

        else if (computerNumber == 3) { 

            if (choice == 1) 

                winOrLose = true; 

            else if (choice == 2) 

                winOrLose = false; 

        } 

     

        // output the round result and add the win to the corresponding winner 

        if (winOrLose == true) { 

            System.out.println("You won this round."); 

            userWins += 1; 

        } 

        else if (winOrLose == false) { 

            if (computerNumber != choice) 

                    System.out.println("You lose this round."); 

            computerWins += 1; 

        } 

         

    }       

    } 

     

    // tell the user their game results 

    System.out.println("\nGame results: "); 

    System.out.println("\tComputer wins: " + computerWins); 

    System.out.println("\tYour wins:     " + userWins); 

     

    if (userWins > computerWins) 

        System.out.println("\nYou won the game more than two times. You win."); 

    else 

        System.out.println("\nThe computer won the game more than two times. You lost."); 

} 

} 