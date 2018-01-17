package Chapter3;
import java.util.Scanner; 
/**
 * Program explores if-statements functionality.
 *
 * @author Grace Hopper
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Declare variables
        double double1;
        double double2;
    
        Scanner input = new Scanner(System.in);
        
        // Ask for user input
        System.out.print("Enter a number >> ");
        double1 = input.nextDouble();
        System.out.print("Enter another number >> ");
        double2 = input.nextDouble();
        
        // Output the number comparisons
        if (double1 < double2){
            System.out.println("The first number is less than the second");
        }
        
        if (double1 > double2){
            System.out.println("The first number is greater than the second");
        }
        
        if (double1 == double2){
            System.out.println("The first number is equal to the second");
        }     
        
        if (double1 <= double2){
            System.out.println("The first number is less than or equal to than the second");
        }
 
        if (double1 != double2){
            System.out.println("The first number is not equal to the second");
        }
        
        if (double2 == 0){
            System.out.println("Cannot divide by zero");
        }
        
        else if (double1 / double2 < 1){
            System.out.println("proper fraction");
        }
        
        else {
            System.out.println("improper fraction");
        }
        
        if (double1 >= 90){
            System.out.println("A");
        }
        
        else if (double1 >= 80){
            System.out.println("B");
        }
        
        else if (double1 >= 70){
            System.out.println("C");
        }
        
        else if (double1 >= 60){
            System.out.println("D");
        }
        
        else {
            System.out.println("F");
        }
        
        if (double2 > 1 && double2 < 100) {
            System.out.println("In range");
        }
        
        else {
            System.out.println("Out of range");
        }
    }
}
