// print the pattern:
//     * * * * *
//     * * * * *
//     * * * * *
//     * * * * *
//     * * * * *

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("column = ");
        int col = sc.nextInt();

        // row
        for (int i = 1; i <= row; i++) {
            // column
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
                if (j < col) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    
    }
}