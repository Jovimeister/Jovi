/*
 * Jovan Gradojevic
 * 11/09/2019
 * The program calculates taxes based on the amount of USBs, keyboards, computer mouses.
 */

package calculatingtax;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author jogra6669
 */
public class CalculatingTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.00");
        
        double mousePrice;
        double usbPrice;
        double keyboardPrice;
        
        System.out.println("A computer mouse costs 25.99$");
        System.out.println("Enter the amount of mouse devices you wish to buy:");
        mousePrice = 25.99 * keyedInput.nextDouble();
        
        System.out.println("A USB costs 19.99$");
        System.out.println("Enter the amount of USBs you wish to buy:");
        usbPrice = 19.99 * keyedInput.nextDouble();
        
        System.out.println("A keyboard costs 49.99$");
        System.out.println("Enter the amount of keyboards you wish to buy:");
        keyboardPrice = 49.99 * keyedInput.nextDouble();
        
        double total = keyboardPrice + usbPrice + mousePrice;      
        final double FULLTOTAL = total;
        double taxTotal = FULLTOTAL * 1.13;
        double onlyTax = FULLTOTAL * 0.13;
        
        System.out.println("The total tax is " + f.format(onlyTax) + "$");
        System.out.println("The total before tax is " + f.format(total) + "$");
        System.out.println("The total after tax is " + f.format(taxTotal) + "$");
    }
}
