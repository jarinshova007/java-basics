// Take an array of numbers as input and check if it is an array sorted in ascending order

import java.util.Scanner;

public class AscendingOrder {
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
        
        boolean isAscending = true;

        // traverse
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                isAscending = false;
            }
            min = arr[i];
        }
        if (isAscending) {
            System.out.println("The array is in ascending number");
        } else {
            System.out.println("The array is not in ascending number");
        }

        sc.close();

    }
}
