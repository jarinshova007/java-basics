// Write a program to fi nd if a number is a power of 2 or not

import java.util.Scanner;

public class PowerOfTwoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();

        if (number > 0 & (number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2");
        } else {
            System.out.println(number + " is not a power of 2");
        }
    }
}
