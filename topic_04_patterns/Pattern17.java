// Print Pascal’s Triangle
//       1
//      1 1
//     1 2 1
//    1 3 3 1
//   1 4 6 4 1

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / j;
            }
            System.out.println();
        }
    }
}
