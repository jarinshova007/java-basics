public class SelectionSort {
    // print array function
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {9, 3, 6, 2, 17, 4};
        printArray(arr);
        System.out.println();
        
        // selection sort
        // time complexity = O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
        int smallest = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[smallest] > arr[j]) {
                smallest = j;
            }
        }
        // swap
        //int temp = arr[smallest];
        //arr[smallest] = arr[i];
        //arr[i] = temp;
        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
    }
        // method call
        printArray(arr);
    }
}
