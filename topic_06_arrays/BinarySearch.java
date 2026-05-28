import java.util.Scanner;

public class BinarySearch {
    // iterative way
    public static int iterative(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] < target) {
                st = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // recursive way
    static int idx = 0;

    public static int recursive(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] > target) {
            return recursive(arr, target, start, mid - 1);
        } else if (arr[mid] < target) {
            return recursive(arr, target, mid + 1, end);
        } else {
            return mid;
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

        System.out.print("target = ");
        int target = sc.nextInt();

        // search
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // or mid = (start + end) / 2

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                System.out.print("found at index " + mid);
                return;
            }
        }
        System.out.println("not found");

        // iterative method call
        // if (iterative(arr, target) >= 0) {
        // System.out.println("found at idx " + iterative(arr, target));
        // } else {
        // System.out.println("not found");
        // }

        // recursive method call
        // if (recursive(arr, target, start, end) >= 0) {
        // System.out.println("found at idx " + recursive(arr, target, start, end));
        // } else {
        // System.out.println("not found");
        // }
    }
}
