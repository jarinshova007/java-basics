// Write a program to toggle a bit a position = “pos” in a number “n”
import java.util.Scanner;

public class Toggle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("pos = ");
        int pos = sc.nextInt();

        // checking
        int bitMask = 1 << pos;
        if ((bitMask & n ) == 0) {
            // set Bit
            System.out.println("new number: " + (bitMask | n));
        } else {
            // clear Bit
            int newBitMask = ~ (bitMask);
            System.out.println("new number: " + (newBitMask & n));
        }

        sc.close();

    }
}