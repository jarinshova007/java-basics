public class InsertionSort {
    // print array function
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        printArray(arr);
        System.out.println();

        int c = 0;
        // insertion sort
        // time complexity = O(n^2)
        // traverse in unsorted part
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            // traverse in sorted part
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
                c++;
            }
            arr[j + 1] = current;
        }
        // method call
        printArray(arr);
        System.out.println("c = " + c);
    }
}
