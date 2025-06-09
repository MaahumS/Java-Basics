// Shipping costs - Java 2ASP25
// Maahum Sattar, Spring 2025

import java.util.Scanner;

public class SattarM_J2CSP25
{
    public static void main(String[] args) 
    {
        //declaring variables
        final double SURCHARGE_RATE ;
        double shipCharge ;
        String shipOption ;
        double ovWeightCharge ;
        char dest ;
        double weight ;
        double totalCost ; 
        String destInput ;
        
        //initializing
        SURCHARGE_RATE = 0.12 ;
        shipCharge = 0.0 ;
        shipOption = "" ;
        ovWeightCharge = 0.0 ;
        weight = 0.0 ;
        totalCost = 0 ;
        destInput = "" ;

        Scanner keyboard = new Scanner(System.in);

        // Ask for destination
        System.out.print("What is the destination (L-Local, N-National, I-International): ");
        destInput = keyboard.nextLine() ;
        destInput = destInput.toUpperCase() ;
        dest = destInput.charAt(0);

        
        // Ask for weight
        System.out.print("Enter the package weight: ");
        weight = keyboard.nextDouble();

        // Determine shipping cost and option w/ switch
        switch (dest) 
        {
            case 'L':
                shipCharge = 12.00;
                shipOption = "Local";
                break;
            case 'N':
                shipCharge = 22.00;
                shipOption = "National";
                break;
            case 'I':
                shipCharge = 53.00;
                shipOption = "International";
                break;
            default:
                System.out.println("Invalid option. Defaulting to International.");
                shipCharge = 53.00;
                shipOption = "International";
        }

        // if statement to test overweight
        if (weight > 100) 
        {
            ovWeightCharge = shipCharge * SURCHARGE_RATE;
        }

        // Calculate total
        totalCost = shipCharge + ovWeightCharge;

        // Display results w/ formatting
        System.out.printf("Shipping Option:\t\t\t%s\n", shipOption);
        System.out.printf("Package Weight:\t\t\t%.2f lbs.\n", weight);
        System.out.printf("Shipping Charge:\t\t\t$%,5.2f\n", shipCharge);
        System.out.printf("Overweight Surcharge:\t$%,2.2f\n", ovWeightCharge);
        System.out.printf("Overweight Charge Rate:\t %.2f%%\n",SURCHARGE_RATE*100) ;
        System.out.printf("Total:\t\t\t\t\t\t$%,5.2f\n", totalCost);
        
       

    }
}