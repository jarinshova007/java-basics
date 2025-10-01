// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings

import java.util.Scanner;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int size = sc.nextInt();

        // array of strings
        String str[] = new String[size];

        // input and length calculation
        int cumuLength = 0;
        System.out.println("input:");
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
            cumuLength += str[i].length();
        }
        
        System.out.println("The cumulative length of all those strings is " + cumuLength);

        sc.close();

    }
}
