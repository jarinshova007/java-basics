// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another

import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalToBinary(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        if (n < 0) {
            System.out.print("-");
                n = -n;
            }
        
            String binary = "";
            while (n > 0) { 
                binary = n % 2 + binary;
                n = n / 2;
            }
            // no need to reverse
            //StringBuilder sb = new StringBuilder(binary);
            //sb.reverse();
            System.out.println(binary);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("decimal Number: ");
        int decimalNum = sc.nextInt();

        // decimal to binary
        System.out.print("The binary number of " + decimalNum + ": "  );
        decimalToBinary(decimalNum);

        sc.close();

    }
}
