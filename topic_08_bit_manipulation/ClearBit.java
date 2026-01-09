// Clear the 3nd bit (position = 2) of a number n. (n = 0101)
import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt(); // 0101 == 5

        System.out.print("pos = ");
        int pos = sc.nextInt(); // 2
        
        int bitMask = 1 << pos;
        int newBitMask = ~(bitMask);

        int newNum = newBitMask & n;
        System.out.println("New Number: " + newNum);
    }
}
