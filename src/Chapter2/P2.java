package Chapter2;
import java.util.Scanner;
/**
 * Program to receive user input as their "meal order" and gives them their "receipt"
 *
 * @author Grace Hopper
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // variable definitions
        double foodPrice, drinkPrice, dessertPrice, mealPrice, taxFactor, tipFactor, mealTotal;
        
        
        // user input
        System.out.print("Enter the price of your food >> ");
        foodPrice = input.nextDouble();
        
        System.out.print("Enter the price of your drink >> ");
        drinkPrice = input.nextDouble();
        
        System.out.print("Enter the price of your dessert >> ");
        dessertPrice = input.nextDouble();
        
        // variable math
        mealPrice = foodPrice + drinkPrice + dessertPrice;
        taxFactor = mealPrice*0.10;
        tipFactor = (mealPrice + taxFactor) * 0.15;
        mealTotal = mealPrice + taxFactor + tipFactor;
        
        // program output
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("RECIEPT INFORMAION");
        System.out.println("------------------------------------");
        System.out.println("Meal Price        >> " + foodPrice);
        System.out.println("Drink Price       >> " + drinkPrice);
        System.out.println("Dessert Price     >> " + dessertPrice);
        System.out.println("------------------------------------");
        System.out.println("Total without tax >> " + mealPrice);
        System.out.println("Tax total         >> " + taxFactor);
        System.out.println("Tip total         >> " + tipFactor);
        System.out.println("------------------------------------");
        System.out.println("Final Price       >> " + mealTotal);
    }
}
