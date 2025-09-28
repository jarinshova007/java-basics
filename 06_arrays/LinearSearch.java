// find an integer number x from a 1D array
import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size = ");
        int size = sc.nextInt();
        int array[] = new int[size];
        // array input
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("x = ");
        int x = sc.nextInt();
        // search
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                System.out.println(x + " is found at index: " + i);
                return;
            }
        }

        System.out.println(x + " is not found");
    }
}
