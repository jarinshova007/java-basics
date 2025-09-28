// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. (x ^ n)

import java.util.Scanner;

public class Power {
    static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }
    /* in a different way
    static int power(int x, int n) {
        return (int)Math.pow(x, n); // type cast
    }
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();

        System.out.println("x ^ n = " + power(x, n));

        sc.close();

    }
}
