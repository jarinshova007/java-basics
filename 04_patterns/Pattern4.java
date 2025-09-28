// print the pattern:
//     * * * *     
//     * * *   
//     * *   
//     * 

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print("*");
                if (j < row) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}