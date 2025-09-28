// print the pattern:
//           * 
//         * * 
//       * * * 
//     * * * * 

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();

        // row
        for (int i = 1; i <= row; i++) {
            // column
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
                if (j > 0) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }

        sc.close();
    
    }
}