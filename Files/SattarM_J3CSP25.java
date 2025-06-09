//Student Info - Used Car Sales Comission
// Spring 2025, Maahum Sattar

import javax.swing.JOptionPane;

public class SattarM_J3CSP25 
{
    public static void main(String[] args) 
    {
        // Declaring variables
        int numCars;
        double commissRate, carPrice, totalSales = 0, commission;
        //String variables to capture user input
        String numCarsString, commissRateString, carPriceString ;
        
        
        // Get user input for number of cars sold and commission percentage
        numCarsString = JOptionPane.showInputDialog("Enter the number of cars sold: ");
        //parsing
        numCars = Integer.parseInt(numCarsString) ;
        commissRateString = JOptionPane.showInputDialog("Enter the commission percentage: ") ;
        commissRate = Double.parseDouble(commissRateString) ;
        commissRate /= 100.0; // Convert percentage to decimal
        
        // Printing detail line (column headers)
        System.out.println("CAR	\tSALES PRICE");
        
        // For loop to process each car sale
        for (int i = 1; i <= numCars; i++) 
        {
            carPriceString = JOptionPane.showInputDialog("Enter the price for car #" + i + ": ");
            carPrice = Double.parseDouble(carPriceString) ;
            totalSales += carPrice;
            
            // Print car sale details
            System.out.printf("%d\t	$%,9.2f\n", i, carPrice);
        }
        
        // Calculate commission
        commission = totalSales * commissRate;
        
        // Print totals
        System.out.printf("\nTOTAL     \t$%,9.2f\n", totalSales);
        System.out.printf("COMMISSION	$%,8.2f\n", commission);
        
        // Exit the program
        System.exit(0);
    }
}
