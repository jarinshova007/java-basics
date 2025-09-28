// A method to calculate the sum of two numbers

import java.util.Scanner;

public class Sum {
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = sc.nextInt();
        System.out.print("num2: ");
        int num2 = sc.nextInt();

        Sum s = new Sum();
        System.out.println(num1 + " + " + num2 + " = " + s.sum(num1, num2));

        sc.close();

    }
}
