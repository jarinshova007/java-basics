// print the pattern:
//     *
//     * *
//     * * *
//     * * * *
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("col = "); // column is not necesary here
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // no extra space
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}