// Updae the 2nd bit (position = 1) of a number n to 1. (n = 0101)

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("oper: ");
        int oper = sc.nextInt(); // oper = 1 -> set;  oper = 0 -> clear
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;
        int newBitMask = ~(bitMask);

        if (oper == 1) {
            // set bit
            int newNum = bitMask | n;
            System.out.println("New Number: " + newNum);
        } else {
            // clear bit
            int newNum = newBitMask & n;
            System.out.println("New Number: " + newNum);
        }
    }
}
