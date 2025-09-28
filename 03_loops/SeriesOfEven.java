// Print all even numbers till n
import java.util.Scanner;

public class SeriesOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        // loop
        System.out.println("Series of even numbers from 1 to n:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
            if (i % 2 == 0 && i < n && n % 2 == 0) {
                System.out.print(", ");
            } else if (i % 2 == 0 && i < n - 1 && n % 2 != 0) {
                System.out.print(", ");
            }
        }

        sc.close();

    }
}
