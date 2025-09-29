// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, num;
        int posNum = 0;
        int negNum = 0;
        int zero = 0;
        System.out.println("Enter 1 to take a number or 0 to exit the program: ");
        while (true) {
            System.out.print("choice: ");
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else {
                if (choice == 1) {
                System.out.print("num: ");
                num = sc.nextInt();
                if (num > 0) {
                    posNum++;
                } else if (num < 0) {
                    negNum++;
                } else {
                    zero++;
                }
            }
        }
    }
        System.out.println("Total Positive Number: " + posNum);
        System.out.println("Total Negative Number: " + negNum);
        System.out.println("Total Zero: " + zero);
    }
}