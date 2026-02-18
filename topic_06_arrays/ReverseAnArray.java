
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

        // print
        printArray(arr);
    }
}