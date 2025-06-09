//Student Info - Java 3A Credit Card Payments
//Spring 2025, Maahum Sattar

import javax.swing.JOptionPane;

public class SattarM_J3ASP25 
{
    public static void main(String[] args) 
    {
        // Declare variables
        double begBal, intRate, pmt, interest, principal, endBal;
        //strings for user input
        String begBalString, intRateString ;
         
        //initialize
        double totalPmts = 0, totalInt = 0, totalPrincipal = 0;
        int pmtNum = 1;

        // Get user input
        begBalString = JOptionPane.showInputDialog("Enter the initial balance:");
        //parsing
        begBal = Double.parseDouble(begBalString) ;
        intRateString = JOptionPane.showInputDialog("Enter the annual interest rate:");
        intRate = Double.parseDouble(intRateString) ;
        intRate /= 100.0; // Convert percentage to decimal

        // Print column headers
        System.out.println("Pymt\tBeg Bal\t	Payment\t\tInterest\t\tPrincipal\t\tEnd Bal");

        // While loop to process payments
        while (begBal > 0) 
        {
            // Calculate payment amount
            pmt = begBal / 43;
            if (pmt < 25) 
            {
                pmt = 25;
            }
            if (pmt > begBal) 
            {
                pmt = begBal; // Last payment equals remaining balance
            }

            // Calculate interest (monthly)
            if (pmt == begBal) 
            {
                interest = 0; // No interest on the last payment
            } 
            else 
            {
                interest = begBal * (intRate / 12);
            }

            // Calculate principal
            principal = pmt - interest;
            
            // Calculate ending balance
            endBal = begBal - principal;
            
            // Print payment details with tab formatting
            System.out.printf("%4d\t$%,9.2f\t$%,8.2f\t$%,8.2f\t$%,8.2f\t$%,9.2f\n", 
                              pmtNum, begBal, pmt, interest, principal, endBal);
            
            // Accumulators
            totalPmts += pmt;
            totalInt += interest;
            totalPrincipal += principal;
            
            // Update beginning balance
            begBal = endBal;
            
            // Increment payment number
            pmtNum++;
        }

        // Print totals
        System.out.printf("\nTotals\t\t$%,9.2f\t$%,8.2f\t$%,9.2f\n", totalPmts, totalInt, totalPrincipal);
        
        // Exit the program
        System.exit(0);
    }
}