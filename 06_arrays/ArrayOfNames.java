// Take an array of names as input from the user and print them on the screen

import java.util.Scanner;

public class ArrayOfNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        // input
        System.out.println("Names:");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". ");
            names[i] = sc.next();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println("Name " + (i + 1) + " is " + names[i]);
        }

        sc.close();

    }
}
