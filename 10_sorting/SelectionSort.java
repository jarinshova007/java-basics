public class SelectionSort {
    // print array function
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {9, 3, 6, 2, 17, 1};
        printArray(arr);
        System.out.println();
        
        // selection sorting
        // time complexity = O(n^2)
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
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
