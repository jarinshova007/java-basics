// read and print a 1D array.

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int size = sc.nextInt();

        int marks[] = new int[size];

        // input
        System.out.println("Take input for the arry: ");
        for (int i = 0; i < marks.length; i++ ) {
            marks[i] = sc.nextInt();
        }
        // print
        System.out.println("Print the array");
        for (int i = 0; i < size; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close();

    }
}