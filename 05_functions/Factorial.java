// Write a function to calculate the factorial of a number

import java.util.Scanner;

public class Factorial {

    public int printFactorial(int N) {
        int factorial = 1;
        for (int i = N; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid Number");
            return;
        }
        
        Factorial p = new Factorial();
        System.out.println("Factorial of " + num + ": " + p.printFactorial(num));

        sc.close();
        
    }
}