
// Reverse an array
import java.util.Scanner;

public class ReverseAnArray {
    // printArray method
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }

    // iterative way
    // public static int[] reverseIterate(int arr[]) {
    // // new array
    // int newArray[] = new int[arr.length];

    // for (int i = 0; i < arr.length; i++) {
    // newArray[i] = arr[arr.length - i - 1];
    // }

    // return newArray;
    // }

    // recursive way
    // public static int[] reverseRecursive(int arr[], int idx, int arrN[]) {
    // if (idx == arr.length) {
    // return arrN;
    // }
    // arrN[idx] = arr[arr.length - idx - 1];
    // return reverseRecursive(arr, idx + 1, arrN);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size = ");
        int size = sc.nextInt();

        // declare and scan
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // reversing with a new array
        int newArr[] = new int[size];

        // copy element
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[size - i - 1];
        }

        // print
        printArray(newArr);
        System.out.println();

        // another way
        for (int i = 0; i < arr.length / 2; i++) {
            int left = i;
            int right = arr.length - i - 1;

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // iterative method call
        // arr = reverseIterate(arr);

        // recursive method call
        // int reversed[] = new int[arr.length];
        // reversed = reverseRecursive(arr, 0, reversed);

        // print
        printArray(arr);
    }
}