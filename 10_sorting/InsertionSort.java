public class InsertionSort {
    // print array function
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 15, 13, 4, 1, 6};

        // insertion sorting
        // time complexity = O(n^2)
        // traverse in unsorted part
        for (int i = 1; i < arr.length - 1; i++) {
            int current = arr[i];
            // traverse in sorted part
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        // method call
        printArray(arr);
    }
}
