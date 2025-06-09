//Student Info - J3B Paint Estimator
//Spring 2025, Maahum Sattar

import javax.swing.JOptionPane;

public class SattarM_J3BSP25 
{
    public static void main(String[] args) 
    {
        // Declare variables and initialize
        double length, width, area, totalArea = 0;
        //string variables to capture user input
        String lengthInput, widthInput ;
        final int COVERAGE_PER_GALLON = 300;
        int gallons ;
        int roomNumber = 1;
        char moreRooms;
        String moreRoomsInput ;

        // Print detail line
        System.out.println("Room #\tLength\tWidth\tArea");
        
        // Do-while loop to process multiple rooms
        do {
            // Get room dimensions from user
            lengthInput = JOptionPane.showInputDialog("Enter the length of room " + roomNumber + ":") ;
            length = Double.parseDouble(lengthInput) ;
            widthInput = JOptionPane.showInputDialog("Enter the width of room " + roomNumber + ":") ;
            width = Double.parseDouble(widthInput) ;
            
            // Calculate area of the room
            area = length * width;
            //accumulate 
            totalArea += area;
            
            // Print room details
             System.out.printf("Room %d Length:  %6.2f  Width:  %6.2f  Area: %8.2f sf\n", roomNumber, length, width, area);
            
            // Ask user if they want to enter another room
            moreRoomsInput = JOptionPane.showInputDialog("Do you have more rooms? (Y/N):").toUpperCase();
            
            //holding user input in a char variable
            moreRooms= moreRoomsInput.charAt(0);
            
            // Increment room number
            roomNumber++;
        } 
        while (moreRooms == 'Y');
        
        // Calculate gallons of paint needed w/ cast operator 
        gallons = (int) (totalArea / COVERAGE_PER_GALLON);
     
      if (totalArea % COVERAGE_PER_GALLON != 0) // If there's a remainder, round up
            {
               gallons += 1;
            }
        
        // Print totals
        System.out.printf("\nTotal square feet = %.2f\n", totalArea);
        System.out.printf("Paint needed: %d gallons\n", gallons);
        
        // Exit program
        System.exit(0);
    }
}
