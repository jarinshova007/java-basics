
// print the following pattern
//   *
//  * *
// * * *
//  * *
//   *
import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("row = ");
        int row = sc.nextInt();

        // upper half
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
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
        // lower half
        for (int i = row - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
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