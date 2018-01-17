package Chapter5;
import java.util.*;
/**
 * Program to reverse any valid string entered by a user.
 *
 * @author Grace Hopper
 */

public class C5_46 { 
/**
    * Main Method
    * 
    * @param args arguments from command line prompt
    */
    public static void main(String[] args){ 

        Scanner input = new Scanner(System.in); 

         

        // prompt the user for a string 

        System.out.print("Enter a string: "); 

        String s1 = input.nextLine(); 

         

        // Output the result for the reversed string using the .reverse() method 

        System.out.println("The reversed string is: "  

                + "\n\t" + (new StringBuffer(s1).reverse().toString())); 

         

    }     

} 
