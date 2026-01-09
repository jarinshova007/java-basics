// Read someone's age and check whether it he/she is adult (age 18 or greater than 18) or not

import java.util.Scanner;

public class AdultOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("An adult");
        } else {
            System.out.println("Not an adult");
        }
    }
}