// print the pattern:
//     1       
//     0 1    
//     1 0 1     
//     0 1 0 1
//     1 0 1 0 1

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();
        int t = 1; int f = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || (j % 2 == 0 && i % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    System.out.print(t + " " );
                } else {
                    System.out.print(f + " ");
                }
            }
            System.out.println();
        }

        sc.close();
        
    }
}