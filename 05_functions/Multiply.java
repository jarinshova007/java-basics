// Write a fumction to multiply two numbers
import java.util.Scanner;

public class Multiply {
    public int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = sc.nextInt();
        System.out.print("num2: ");
        int num2 = sc.nextInt();

        Multiply m = new Multiply();
        System.out.println(num1 + " * " + num2 + " = " + m.multiply(num1, num2));

        sc.close();

    }
}