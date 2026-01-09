// Write a function that calculates the Greatest Common Divisor or Hight Common Factor of 2 numbers

import java.util.Scanner;

public class GCD {
    public static int gcd(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n2; // it counld be n1 because now n1 == n2
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = sc.nextInt();
        System.out.print("num2: ");
        int num2 = sc.nextInt();

        System.out.println("The GCD is " + gcd(num1, num2));

        sc.close();
        
    }
}
