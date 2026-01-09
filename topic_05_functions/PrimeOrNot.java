// Make a function to check if a number is prime or not

import java.util.Scanner;

public class PrimeOrNot {
    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println("Not a prime number");
            return;
        }
        PrimeOrNot p = new PrimeOrNot();
        if (p.isPrime(num)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}