// Get the 3rd bit (position = 2) of a number n. (n = 0101)

public class GetBit {

    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("The bit was zero");
        } else {
            System.out.println("The bit was one");
        }
    }
}