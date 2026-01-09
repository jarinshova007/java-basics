// Find the maximum & minimum number in a 1D array of integer numbers

import java.util.Scanner;

public class MaxAndMin {
    /* method style
    public static void findMaxMin (int arr[]) {
        int max = arr[0]; int min = arr[0];
        int idxMin = 0;
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }
        System.out.println("max: " + max + "\nidx: " + idx);
        System.out.println("min: " + min + "\nidx: " + idxMin);
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        // input
        System.out.print("input:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // minimum and maximum
        int indexOfMax = 0;
        int indexOfMin = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        System.out.println("The maximum number is at index: " + indexOfMax + " and it is " + max);
        System.out.println("The minimum number is at index: " + indexOfMin + " and it is " + min);

        // method call
        // findMaxMin(array);
    }
}
