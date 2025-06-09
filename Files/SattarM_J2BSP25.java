//Cruise Rewards - Java 1CSP25 
// Maahum Sattar, Spring 2025

//import scanner
import java.util.Scanner;

public class SattarM_J2BSP25 
{
    public static void main(String[] args) 
    {
        // instansiate scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //declare variables
        double exp ;
        int points ;
 
        //initializing        
        points = 0;
        exp = 0;
        
        System.out.print("Enter your total expenditure: ");
        exp = keyboard.nextDouble();

        // Determine points using if-else
        
        if (exp >= 10000) 
        {
            points = 500;
            
        } 
        
        else if (exp >= 5000) 
        {
            points = 300;
        }
         
        else if (exp >= 2000) 
        {
            points = 200;
        }
         
        else if (exp >= 1000) 
        {
            points = 100;
        }

        // Display points awarded
        if(exp >= 1000)
        {
        System.out.println("Points awarded: " + points);
        }
        else
        {
        System.out.println("Not eligible for rewards."); 
        }
        
    }
}