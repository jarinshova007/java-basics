// print a palindromic number pyramid:
//               1
//             2 1 2
//           3 2 1 2 3
//         4 3 2 1 2 3 4
//       5 4 3 2 1 2 3 4 5

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            // left half
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // right half
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}