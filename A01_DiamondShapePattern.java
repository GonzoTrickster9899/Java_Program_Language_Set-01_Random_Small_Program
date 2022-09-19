import java.util.Scanner;                                           // Import for getting user input.

public class A01_DiamondShapePattern {                              // Start from the public classs DiamondShapePattern (same as a filename)
    public static void main(String[] args) {                        // Opening for main program to run or debug
        int row, i, j, space = 1;                                   // Initiate from integers row, i, j and space (variable)
        System.out.print("Enter the number of rows: ");             // Print on the screen about request input 
        Scanner sc = new Scanner(System.in);                        // Initiate from function Scanner for getting user input
        row = sc.nextInt();                                         // Initiate the variable row to read the inputted value
        space = row - 1;                                            // Initiate the variable space to decrement the row by 1
        for (j = 1; j<= row; j++){                                  // For Loop Statement: start from variable value of j 1 to inputted value of row
            for (i = 1; i<= space; i++){                            // Inner For Loop Statement: start from variable value of i 1 to value of space
                System.out.print(" ");                              // Print the space on the screen
            }                                                       // Close Inner For Loop Statement
            space--;                                                // Decrement the space by 1
            for (i = 1; i <= 2 * j - 1; i++){                       // Inner For Loop Statement: start from variable value of i 1 to value of 2 * j - 1 by increment 1
                System.out.print("*");                              // Print the * on the screen
            }                                                       // Close Inner For Loop Statement
            System.out.println("");                                 // Print the nextline on the screen
        }                                                           // Close For Loop Statement
        space = 1;                                                  // Initiate the value of variable space 1
        for (j = 1; j <= row - 1; j++){                             // For Loop Statement
            for(i = 1; i <= space; i++){                            // Inner For Loop Statement: start from the value of i 1 to value of variable space by increment 1
                System.out.print(" ");                              // Print space on the screen
            }                                                       // Close Inner For Loop Statements
            space++;                                                // Increment space by 1
            for (i = 1; i<= 2 * (row - j) - 1; i++){                // Inner For Loop Statement: start from the value of i 1 to value of 2 * (row - j) - 1 by increment 1
                System.out.print("*");                              // Print "*" on the screen
            }                                                       // Close Inner For Loop Statement
            System.out.println("");                                 // Print the nextline on the screen
        }                                                           // Close For Loop Statement
    }                                                               // End of main program
}                                                                   // ENd of class DiamondShapePattern
