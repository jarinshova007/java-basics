// Enter 3 numbers from the user & make a program to print their average

import java.util.Scanner;

public class Average {
    static double average(double n1, double n2, double n3) {
        double avg = (n1 + n2 + n3) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 : ");
        double num1 = sc.nextDouble();
        System.out.print("num2 : ");
        double num2 = sc.nextDouble();
        System.out.print("num3 : ");
        double num3 = sc.nextDouble();

        System.out.printf("%.2f", average(num1, num2, num3));

        sc.close();

    }
}
