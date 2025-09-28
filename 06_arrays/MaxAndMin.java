// Find the maximum & minimum number in an array of integer

import java.util.Scanner;

public class MaxAndMin {
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
    }
}
