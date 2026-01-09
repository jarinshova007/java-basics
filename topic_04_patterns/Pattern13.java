// print the pattern:
//           *
//         * * *
//       * * * * *
//     * * * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();
        

        // upper left half
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // upper right half
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower left half  (with a completely different logic)
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= row - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /* the reverse of the upper half (it also works to print the lower half)
        
        for (int i = row; i >= 1; i--) {              (the only different line)
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // upper right half
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */
    }
}