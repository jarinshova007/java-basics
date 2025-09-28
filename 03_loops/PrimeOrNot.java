// Print if a number is prime or not (Input n from the user)

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println(num + " is not a prime number");
            return;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                return;
            }
        }

        System.out.println(num + " is a prime number");

        sc.close();

    }
}
