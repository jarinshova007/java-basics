import java.util.Scanner;

public class DeleteAnElement {
    // method format
    public static int deleteAnElement(int arr[], int size, int idx) {
        if (idx == size - 1) {
            size--;
        } else {
            for (int i = idx; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
        return size; // returns the new size
    }

    // find element
    public static int findIndex(int arr[], int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    // print
    public static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // if the index is given
        System.out.print("index = ");
        int idx = sc.nextInt();

        // // if the element is given
        // System.out.print("element = ");
        // int ele = sc.nextInt();
        // // find element method call
        // int idx = findIndex(arr, ele);

        if (idx == size - 1) {
            size--;
        } else {
            for (int i = idx; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }

        // method call
        // size = deleteAnElement(arr, size, idx);

        // print
        printArray(arr, size);

        sc.close();
    }
}
