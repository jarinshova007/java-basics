// Get the 2nd bit (position = 1) of a number n. (n = 0101)
public class SetBit {
public static void main(String[] args) {
    int n = 5; // 0101
    int pos = 1;
    int bitMask = 1 << pos;

    int newNum = bitMask | n;
    System.out.println("New number: " + newNum);
    }
}
