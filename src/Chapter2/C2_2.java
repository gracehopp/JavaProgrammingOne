package Chapter2;
import java.util.Scanner; 
/**
 * Program to calculate a problem entered by a user
 *
 * @author Grace Hopper
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

         

        final double pi = 3.141; 

         

        System.out.print("Enter the radius and length of a cylinder >> "); 

        double radius = input.nextDouble(); 

        double length = input.nextDouble(); 

         

        double area = radius * radius * pi; 

        double volume = area * length; 

         

        System.out.println("The area is " + area); 

        System.out.println("The volume is " + volume); 
    }
}
