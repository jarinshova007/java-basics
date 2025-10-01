// Write a program to count the number of 1’s in a binary representation of the number

import java.util.Scanner;

public class CountOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= 32 - 1; i++) {
            int bitMask = 1 << i;
            if ((bitMask & num) != 0) {
                count += 1;
            }
        }

        System.out.println("number of 1's: " + count);

        sc.close();

    }
}
