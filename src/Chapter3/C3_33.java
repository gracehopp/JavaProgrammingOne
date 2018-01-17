package Chapter3;
import java.util.Scanner; 
/**
 * Program to display "Welcome to Java" to the console
 *
 * @author Grace Hopper
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

         

        // Declare variables 

        int weightOne; 

        int weightTwo; 

        double priceOne; 

        double priceTwo; 

        double packageOne; 

        double packageTwo; 

         

        // Ask for user input 

        System.out.print("Enter weight and price for package 1 >> "); 

        weightOne = input.nextInt(); 

        priceOne = input.nextDouble(); 

         

        System.out.print("Enter weight and price for package 2 >> "); 

        weightTwo = input.nextInt(); 

        priceTwo = input.nextDouble(); 

         

        // Define variables 

        packageOne = priceOne/weightOne; 

        packageTwo = priceTwo/weightTwo; 

         

        // Define conditionals and ouput answer 

        if (packageOne != packageTwo && packageOne <= packageTwo){ 

            System.out.println("Package 1 has a better price."); 

        } 

         

        else if (packageOne != packageTwo && packageTwo >= packageTwo){ 

            System.out.println("Package 2 has a better price."); 

        } 

         

        else if (packageOne == packageTwo){ 

            System.out.println("Both packages have the same price."); 

        } 
    }
}
