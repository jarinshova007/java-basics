// Take an array of numbers as input and check if it is an array sorted in ascending order

import java.util.Scanner;

public class AscendingOrder {
    /* in method style
    static boolean isAscending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input
        System.out.print("The Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        /* manual way
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > (arr[i + 1])) {
                System.out.println("descending");
                return;
            } 
        } 
         */

        // traverse
        boolean isAscending  = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is in ascending order");
        } else {
            System.out.println("The array is not in ascending order"); // in descending order
        }

        sc.close();

    }
}
