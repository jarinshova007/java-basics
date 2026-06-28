import java.util.Scanner;

public class DeleteAnElement {
    // method format - deletes an element and returns the new size
    public static int deleteAnElement(int arr[], int size, int idx) {
        if (idx == size - 1) {
            return size - 1;
        }

        for (int i = idx; i < size; i++) {
            arr[i] = arr[i + 1];
        }

        return size - 1;
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

        // // if the element is given find out the index
        // System.out.print("element = ");
        // int ele = sc.nextInt();

        // int idx = -1;
        // for (int i = 0; i < size; i++) {
        // if (arr[i] == ele) {
        // idx = i;
        // }
        // }

        if (idx == size - 1) {
            size--;
        } else {
            // <- left shift
            for (int i = idx; i < size; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }

        // method call
        // size = deleteAnElement(arr, size, idx);

        // print
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
