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
        System.out.print("col = "); // column is not necessary here
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
                // as we need one more space after every space
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}