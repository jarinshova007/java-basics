
/*  print the pattern:
           *      *  
           **    **
           ***  ***
           ********
           ********
           ***  ***
           **    **
           *      *   
 */

import java.util.Scanner;

class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();

        // upper half
        for (int i = 1; i <= row; i++) {
            // upper left half (*)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // upper right half (*)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = row; i >= 1; i--) {
            // lower left half (*)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // lower right half (*)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
        
    }
}   





