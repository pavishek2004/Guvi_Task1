package PatternPrinting;

import java.sql.SQLOutput;

public class Pattern {
    public static void main(String[] args) {
      int k=5;// Total number of rows and columns
        // Outer loop for rows (1 to 5)
        for(int i=1;i<=k;i++){
            // Inner loop for columns (1 to 5)
            for(int j=1;j<=k;j++){
                // If column index is less than or equal to the row index
                // print decreasing numbers from 5 (e.g., 5, 4, 3, ...)
                if (j <= i) {
                    System.out.print(5 - j + 1);
                }
                // Else, repeat the last decreasing value for the rest of the row
                else {
                    System.out.print(5 - i + 1);
                }           }
            System.out.println("");
        }
    }
}
