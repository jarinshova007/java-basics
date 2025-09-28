// Write a function to print the sum of all odd numbers from 1 to n

import java.util.Scanner;

public class SumOfOdd {
    public static int sumOfOdd(int n) {
        int sum = 0;
        if (n <= 1) {
            for (int i = 1; i >= n; i--) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            return sum;
        } else {
            for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        // print the sum of odd numbers 1 to n
        System.out.println("Sum of odd numbers 1 to " + n + ": " + sumOfOdd(n));

        sc.close();

    }
}
