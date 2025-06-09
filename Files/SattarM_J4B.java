//Student Info - java 4B Hockey Tickets & methods
//Maahum Sattar, Fall 2024 

import java.util.Scanner ;

public class SattarM_J4B
{
   public static void main(String[] args) 
   {
      int ticketAmt ;
      double baseCost ; // ticketAmt * base price
      final double BASE_TICKET_PRICE = 118 ;
      double subTotal ; // price before sales tax
      double totalCost, discountRate, discountAmt, salesTaxAmt ;
      final double SALES_TAX_RATE = 0.0825 ;
      
      //initializing
      discountRate = 0 ;
      discountAmt = 0 ;
      salesTaxAmt = 0 ;
      
      Scanner keyboard = new Scanner(System.in) ;
      
      System.out.println("How many tickets are you purchasing? ") ;
      ticketAmt = keyboard.nextInt() ;
      baseCost = BASE_TICKET_PRICE * ticketAmt ;
      
      //Calling the discountCalculator method
      discountRate = discountCalculator(discountRate, ticketAmt) ;
      
      discountAmt = discountRate * baseCost ;
      
      subTotal = baseCost - discountAmt ;
      
      //Calling the salesTaxCalculator method
      salesTaxAmt = salesTaxCalculator(salesTaxAmt, SALES_TAX_RATE, subTotal) ;
      
      totalCost = salesTaxAmt + subTotal ;
      
      //Calling the displayReport method
      displayReport(ticketAmt,baseCost,BASE_TICKET_PRICE,discountRate,discountAmt,subTotal,SALES_TAX_RATE,
      salesTaxAmt,totalCost) ;

      
   }
   
   public static double discountCalculator(double discountRate, int ticketAmt)
   {
      if (ticketAmt >= 10 && ticketAmt <= 19)
      {
         discountRate = 0.05 ;
      }      
      else if (ticketAmt >= 20 && ticketAmt <= 30)
      {
         discountRate = 0.10 ;
      }
      else if (ticketAmt > 30)
      {
         discountRate = 0.15 ;
      }
      
      return discountRate ;
      
   }
   
   public static double salesTaxCalculator(double salesTaxAmt, final double SALES_TAX_RATE,double subTotal)
   {
      salesTaxAmt = SALES_TAX_RATE * subTotal ;
      return salesTaxAmt ;    
   }
   
   public static void displayReport(int ticketAmt, double baseCost, final double BASE_TICKET_PRICE, 
   double discountRate,double discountAmt, double subTotal, final double SALES_TAX_RATE, 
   double salesTaxAmt, double totalCost)
   {
      System.out.printf("Tickets Purchased: %,4d \nBase Cost ($%,.0f/ea): $%,4.2f\nDiscount (%.0f%%):" +
      "\t\t\t$%,.2f\nSubtotal: \t\t\t\t$%,.2f\nSales Tax (%.2f%%): \t$%,.2f\n\nTotal Cost: \t\t\t$%,6.2f", +
      ticketAmt,BASE_TICKET_PRICE,baseCost, discountRate*100, discountAmt, subTotal,+ 
      SALES_TAX_RATE * 100,salesTaxAmt, totalCost) ; 
   }   
}