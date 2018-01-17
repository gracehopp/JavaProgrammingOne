package Chapter6;
import java.util.*;

/**
 * Program to convert currency as specified by the user.
 *
 * @author Grace Hopper
 */

public class P6 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        String yesOrNo = "",
                yes = "yes",
                no = "no";
        String currency = "",
                euro = "Euros", 
                pound = "Pound Sterlings",
                yen = "Yen";
        double x = 0, 
                deductable = 0;
        
        
        // ask user for currency conversion rates
        System.out.print("How many Euros will a dollar buy? ");
        double euroAmt = input.nextDouble();
        
        System.out.print("How many Pound Sterlings will a dollar buy? ");
        double poundAmt = input.nextDouble();
        
        System.out.print("How many Yen will a dollar buy? ");
        double yenAmt = input.nextDouble();
        
        // loop until user needs no more conversions
        while (yesOrNo.toLowerCase().contains("no") == false){
            System.out.print("Please enter the number of dollars you want to convert: ");
            double dollarAmt = input.nextDouble();
            
            System.out.print("Enter\"E\" to buy Euros, \"P\" to buy Pounds, or \"Y\" to buy Yen: ");
            String j = input.next();
            
           if (j.toUpperCase().contains("E")){
               currency = euro;
               x = euroAmt;
           }
           
           else if (j.toUpperCase().contains("P")){
               currency = pound;
               x = poundAmt;
           }
           
           else if (j.toUpperCase().contains("Y")){
               currency = yen;
               x = yenAmt;
           }
            
           
           // pass numbers to the conversion method to convert them
           Conversion(dollarAmt, deductable, x);
           
           
            System.out.print(" " + currency + ".");
            System.out.print("\nAre there more conversions to perform? ");
            yesOrNo = input.next();
            
            // tests the user's input (whether they want to continue or not)
            if (yesOrNo.toLowerCase().contains(yes)){
                continue;
            }
            
            else if (yesOrNo.toLowerCase().contains(no)){
                break;
            }
            
            else {
                while (true){
                   System.out.print("Please enter \"yes\" to continue, or \"no\" to exit the program: ");
                   yesOrNo = input.next();
                   
                   if (yesOrNo.toLowerCase().contains(yes)){
                       break;
                   }
                   else if (yesOrNo.toLowerCase().contains(no)){
                       break;
                   }
                   else
                       continue;
                   }
               }
        }
    }
    /**
     * Conversion more accurately approximates the end total given by the user using the rate the currency runs and the deductable amount charged.
     * @param dollarAmt dollarAmt is the amount in dollars given in exchange for foreign currency
     * @param deductable deductable is the deductable charged on the dollar amount
     * @param x x is the rate amount of the foreign currency ratio to one dollar
     * @return 
     */
    
    public static double Conversion(double dollarAmt, double deductable, double x){
        // the methid Conversion converts the user's dollars to foreign currency, using a deductable tax depending in the conversion amount.
            if (dollarAmt <= 100){
                deductable = 0.1;
            }
            else if (dollarAmt > 100){
                deductable = 0.05;
            }
            
            double endTotal = (dollarAmt - (deductable * dollarAmt)) * x;
            
            System.out.printf("For $%.2f you can buy %.2f", dollarAmt, endTotal);
            
            return deductable;
    }
}

