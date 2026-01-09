// Take an array of names as input from the user and print them on the screen

import java.util.Scanner;

public class ArrayOfNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int size = sc.nextInt();
        sc.nextLine();  // there created a new line to balance that a next line is taken here. Otherwise, program will count it an empty string
        
        // array of string
        String names[] = new String[size];

        //input and print
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i + 1) + " is " + names[i]);
        }
    }
}
