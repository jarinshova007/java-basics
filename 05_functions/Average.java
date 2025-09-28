// Enter 3 numbers from the user & make a program to print their average

import java.util.Scanner;

public class Average {
    static int average(int n1, int n2, int n3) {
        int avg = (n1 + n2 + n3) / 3;
        return avg;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("num1 : ");
    int num1 = sc.nextInt();
    System.out.print("num2 : ");
    int num2 = sc.nextInt();
    System.out.print("num3 : ");
    int num3 = sc.nextInt();

    System.out.println("Average: " + average(num1, num2, num3));
    
    sc.close();

    }
}
