package Chapter4;
import java.util.Scanner; 
/**
 * Program to display work information on two bidder's service.
 *
 * @author Grace Hopper
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for bidder information for the first bidder
        System.out.println("\nThe details asked for below concern the first bidder");
        System.out.print("Enter your name >> ");
        String b1 = input.next();
        System.out.print("Enter the hours of work you require >> ");
        Double bidderOneWork = input.nextDouble();
        System.out.print("Enter your charge per hour >> ");
        Double bidderOneCharge = input.nextDouble();
        
        // Ask user for bidder information for the second bidder
        System.out.println("\nThe details asked for below concern the second bidder");
        System.out.print("Enter your name >> ");
        String b2 = input.next();
        System.out.print("Enter the hours of work you require >> ");
        Double bidderTwoWork = input.nextDouble();
        System.out.print("Enter your charge per hour >> ");
        Double bidderTwoCharge = input.nextDouble();
        
        // Calculations for bidder work pay
        Double firstCost = bidderOneWork * bidderOneCharge;
        Double secondCost = bidderTwoWork * bidderTwoCharge;
        
        if (firstCost < secondCost){
            System.out.printf("\n%s is the winner\n", b1);
            System.out.printf("Total cost: $%.2f\n", firstCost);
            System.out.printf("Total number of hours: %d\n", bidderOneWork);
            
        }
        
        else if (firstCost > secondCost){
            System.out.printf("\n%s is the winner\n", b2);
            System.out.printf("Cost: $%.2f\n", secondCost);
            System.out.printf("Total number of hours: %d\n", bidderTwoWork);
        }
        
        else if ((firstCost == secondCost)&&(bidderOneWork < bidderTwoWork)){
            System.out.printf("\n%s is the winner\n", b1);
            System.out.printf("Cost: $%.2f\n", firstCost);
            System.out.printf("Total number of hours: %d\n", bidderOneWork);
        }
        
        else if ((firstCost == secondCost)&&(bidderOneWork > bidderTwoWork)){
            System.out.printf("\n%s is the winner\n", b2);
            System.out.printf("Cost: $%.2f\n", secondCost);
            System.out.printf("Total number of hours: %d\n", bidderTwoWork);
        }
        
        if ((firstCost == secondCost)&&(bidderOneWork == bidderTwoWork)){
            System.out.printf("\n%s and %s have identical offers\n", b1, b2);
            System.out.printf("Total number of hours: %d\n", bidderOneWork);
            System.out.printf("Cost per hour: $%.2f\n", bidderOneCharge);
            System.out.printf("Cost: $%.2f\n", firstCost);
        }
    }
}
