import java.util.Scanner;
import java.text.NumberFormat;

public class Price 
{
    //Calculates the final price of a purchase item
    //using values entered by user
    
    public static void main(String args[]) {
        //instance constant and variables
        final double TAX_RATE = 0.06; //6% sales tax
        
        int quantity;
        double subtotal, tax, totalcost, unitPrice;
        Scanner scan = new Scanner (System.in);
        
        //getting user input
        System.out.print("Enter the quantity: ");
        quantity = scan.nextInt();
        
        System.out.print("Enter the unit price: ");
        unitPrice = scan.nextDouble();
        
        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalcost = subtotal + tax;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        System.out.println("Subtotal: " + money.format(subtotal));
        System.out.println("Tax: " + money.format(tax) + " at " + percent.format(TAX_RATE));
        System.out.println("Total: " + money.format(totalcost));
        
        System.out.println("*Nathan Dilla's Work*");
        
    }
}