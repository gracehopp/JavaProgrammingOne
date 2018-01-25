package Chapter7;
import java.util.*;
/**
 *
 * @author Grace Hopper
 */
public class C7_9 {
    /**
     * main method
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){ 

         

        Scanner input = new Scanner(System.in); 

         

        // prompts the user to fill the array with ten values 

        double[] array = new double[10]; 

        System.out.print("Enter 10 numbers >> "); 

         

        for (int i = 0; i < array.length; i++){ 

            array[i] = input.nextDouble(); 

        } 

         

        // calls and prints the min value 

        System.out.print("The minimum value is "); 

        System.out.println(min(array)); 

         

    } 

     /**
      * 
      * @param array
      * @return 
      */
    public static double min(double[] array) { 

    double min = array[0]; 

    for (int i = 1; i < array.length; i++) { 

        if (array[i] < min) { 

            min = array[i]; 

        } 

    } 

    return min; 

} 
}
