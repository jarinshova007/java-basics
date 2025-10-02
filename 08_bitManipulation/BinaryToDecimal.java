// Write a function binaryToDecimal() to convert a number from one number system to another

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(String n) {
        boolean isNegative = false;

        if (n.charAt(0) == '-') {
            isNegative = true;
            n = n.substring(1);
        }

        int decimal = 0;
        int power = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            decimal += (n.charAt(i) - '0') * Math.pow(2, power);
            power++;
        }
        return isNegative ? -decimal : decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Binary number: ");
        String binaryNum = sc.next();

        // function call
        System.out.print("Decimal num of " + binaryNum + ": " + binaryToDecimal(binaryNum));

        sc.close();

    }
}