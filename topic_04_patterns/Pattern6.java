// print the pattern:
//     1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("col = "); // column is not necessary here
        int col = sc.nextInt();
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                // no extra space
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}