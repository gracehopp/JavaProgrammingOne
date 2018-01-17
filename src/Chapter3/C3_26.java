package Chapter3;
import java.util.Scanner; 
/**
 * Program to display "Welcome to Java" to the console
 *
 * @author Grace Hopper
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

         

        // Declare variables 

        int number; 

        boolean test; 

         

        // Ask for an integer from the user 

        System.out.print("Enter an integer >> "); 

        number = input.nextInt(); 

         

        // Define conditionals and print outcomes 

         

        // Conditional 1 - is the number divisible by both 5 and 6? 

        if (number % 5 == 0 && number % 6 == 0){ 

            test = true; 

        } 

        else { 

            test = false; 

        } 

        System.out.println("Is " + number + " divisible by 5 and 6? " + test); 

         

        // Conditional 2 - is the number divisible by 5 or 6? 

        if (number % 5 == 0 || number % 6 == 0){ 

            test = true; 

        } 

        else { 

            test = false; 

        } 

        System.out.println("Is " + number + " divisible by 5 or 6? " + test); 

         

        // Conditional 3 - is the number divisible by either 5, or 6, but not both? 

        if (number % 5 == 0 ^ number % 6 == 0){ 

            test = true; 

        } 

        else { 

            test = false; 

        } 

        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + test); 
    }
}
