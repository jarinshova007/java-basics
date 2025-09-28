// Write a function which takes in 2 numbers and returns the greater of those two

import java.util.Scanner;

public class GreaterNumber {
    static int greater(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("num1 : ");
    int num1 = sc.nextInt();
    System.out.print("num2 : ");
    int num2 = sc.nextInt();

    System.out.print("The greater number is " + greater(num1, num2));
    if (greater(num1, num2) == num1) {
        System.out.println(" and \nthe lesser number is " + num2);
    } else {
        System.out.println(" and \nthe lesser number is " + num1);
    }

    sc.close();

    }
}
