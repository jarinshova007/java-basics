
// find an integer number x from a 1D array
import java.util.Scanner;
//Time Complexity: O(n)

public class LinearSearch {
    // iterative way
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // recursive way
    static int idx = 0;

    public static int recursive(int arr[], int target, int idx) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        }

        return recursive(arr, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size = ");
        int size = sc.nextInt();
        int array[] = new int[size];
        // array input
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("target = ");
        int target = sc.nextInt();

        // search
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                System.out.println(target + " is found at index: " + i);
                return;
            }
        }

        System.out.println(target + " is not found");

        // iterative method call
        // if (linearSearch(array, target) != -1) {
        // System.out.println("found at idx " + linearSearch(array, target));
        // } else {
        // System.out.println("not found");
        // }

        // recursive method call
        // if (recursive(array, target, idx) != -1) {
        // System.out.println("found at idx " + recursive(array, target, idx));
        // } else {
        // System.out.println("not found");
        // }

        sc.close();
    }
}
