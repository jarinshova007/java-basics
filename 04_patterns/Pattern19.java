// Print Inverted Half Pyramid:
//   11111
//   222
//   33
//   4

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}