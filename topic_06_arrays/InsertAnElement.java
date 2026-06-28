import java.util.Scanner;

public class InsertAnElement {
    // method format - inserts an element and returns the new size
    public static int insertAnElement(int arr[], int size, int idx, int ele) {
        if (idx == size) {
            arr[idx] = ele;
            return size + 1;
        }

        for (int i = size; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = ele;

        return size + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MAX = ");
        final int MAX = sc.nextInt();

        int arr[] = new int[MAX];

        System.out.print("size = ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("index = ");
        int idx = sc.nextInt();

        System.out.print("element = ");
        int ele = sc.nextInt();

        if (idx == size) {
            arr[idx] = ele;
        } else {
            // right shift ->
            for (int i = size; i >= idx; i--) {
                arr[i + 1] = arr[i];
            }
            arr[idx] = ele;
        }

        size++; // increase the size by 1

        // // method call
        // size = insertAnElement(arr, size, idx, ele);

        // print
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
