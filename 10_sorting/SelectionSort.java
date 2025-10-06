public class SelectionSort {
    // print array function
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8, 5, 9, 4, 11, 2, 1, 3};
        
        // selection sorting
        // time complexity = O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    // swap
                    int temp = arr[i];
                    arr[i] = min;
                    arr[j] = temp;
                }
            }
        }
        // method call
        printArray(arr);
    }
}
