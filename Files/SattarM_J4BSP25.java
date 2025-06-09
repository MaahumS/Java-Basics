//Student Info - Java 4B Income stmt 
//Maahum Sattar - Spring 2025

import javax.swing.JOptionPane ;

public class SattarM_J4BSP25
{
   public static void main(String[] args) //this is my main method
   {
      //declaring variables
      String companyName ; 
      double revenue ;
      double expense;
      double netIncome ;
      //asking for company name in main 
      companyName = JOptionPane.showInputDialog("Enter the company name: ") ;
      
      //detail line
      System.out.println("Company: " + companyName + "\nIncome Statement") ; 
      
      //calling revenue method 
      revenue = revenue() ;
      
      //calling expense method 
      expense = expense() ;
      
      //net income calculation & display
      netIncome = revenue - expense ;
      
      System.out.printf("\n\nNet Income: $%,10.2f",netIncome) ;
   }
   
   //1st method value returning w/ no parameters
   public static double revenue()
   {
      //declare & initializing values 
      double incomeAmt = 0 ;
      String incomeAmtString ;
      String itemDesc ;
      int itemCt = 1 ;
      double totalRev = 0 ;
      String moreItemString ;
      char moreItems ;
      //detail line 
      System.out.println("\nRevenues") ;
      
      do
      {
      itemDesc = JOptionPane.showInputDialog("Enter the description for item " + itemCt+":") ;
      incomeAmtString = JOptionPane.showInputDialog("Enter the income amount for " + itemDesc+":") ;
      incomeAmt = Double.parseDouble(incomeAmtString) ;
      
      //accumulate rev
      totalRev += incomeAmt ;
      
      //print details for this iteration of loop
      System.out.printf("\n\t%-25s\t\t\t$%,10.2f",itemDesc,incomeAmt) ; 
      
      //prepare for next iteration of loop
      moreItemString = JOptionPane.showInputDialog("Do you have more items to enter? (Y/N)").toUpperCase() ;
      moreItems = moreItemString.charAt(0);
      
      itemCt ++ ;
      
      } while (moreItems == 'Y') ;
      
     //display total rev
     System.out.printf("\n\n\tTotal Revenue: $%,6.2f",totalRev) ;   
     return totalRev ;
   }
   
   //2nd method value returning w/ no parameters passed
  public static double expense()
  { 
   //declare & initializing values 
      double expenseAmt = 0 ;
      String expenseAmtString ;
      String expDesc ;
      int expCt = 1 ;
      double totalExp = 0 ;
      String moreExpString ;
      char moreExp ;
      //detail line 
      System.out.println("\n\nExpenses") ;
      
      do
      {
      expDesc = JOptionPane.showInputDialog("Enter the description for expense " + expCt+":") ;
      expenseAmtString = JOptionPane.showInputDialog("Enter the expense amount for " + expDesc+":") ;
      expenseAmt = Double.parseDouble(expenseAmtString) ;
      
      //accumulate rev
      totalExp += expenseAmt ;
      
      //print details for this iteration of loop
      System.out.printf("\n\t%-25s\t\t\t$%,10.2f",expDesc,expenseAmt) ; 
      
      //prepare for next iteration of loop
      moreExpString = JOptionPane.showInputDialog("Do you have more expenses to enter? (Y/N)").toUpperCase() ;
      moreExp = moreExpString.charAt(0);
      
      expCt ++ ;
      
      } while (moreExp == 'Y') ;
      
     //display total rev 
     System.out.printf("\n\n\tTotal Expenses: $%,6.2f",totalExp) ;    
     return totalExp ;

   }
   
   
}