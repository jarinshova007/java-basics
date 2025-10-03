// 12 questions and answers
public class Exercises {

    // 1. Sum of first N numbers
    static int sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    // 2. Find maximum in an array
    static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    // 3. Count digits of a number
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    /*
     * Time Complexity: O(log n) (number of digits in n)
     * Space Complexity: O(1)
     */

    // 4. Check if array contains duplicates (brute force)
    static boolean containsDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
    /*
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */

    // 5. Binary Search (sorted array)
    static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    /*
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */

    // 6. Factorial using recursion
    static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }
    /*
     * Time Complexity: O(n)
     * Space Complexity: O(n) (recursive stack)
     */

    // 7. Matrix multiplication (n × n)
    static int[][] multiplyMatrix(int a[][], int b[][], int n) {
        int c[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
    /*
     * Time Complexity: O(n^3)
     * Space Complexity: O(n^2) (result matrix)
     */

    // 8. Merge Sort
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }
    /*
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     */

    // 9. Fibonacci using recursion
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    /*
     * Time Complexity: O(2^n)
     * Space Complexity: O(n) (recursive stack)
     */

    // 10. 2-pointer technique to find pair sum (sorted array)
    static void twoPointerPairSum(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                return;
            } else if (sum < target)
                left++;
            else
                right--;
        }
        System.out.println("No pair found");
    }
    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    // 11. QuickSort
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }
    /*
     * Time Complexity: Average O(n log n), Worst O(n^2)
     * Space Complexity: O(log n) (recursive stack)
     */

    // 12. Check if string is palindrome
    static boolean isPalindromeIterative(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right)
            return true;
        if (s.charAt(left) != s.charAt(right))
            return false;
        return isPalindromeRecursive(s, left + 1, right - 1);
    }
    /*
     * Time Complexity: O(n)
     * Space Complexity: O(n) (recursive stack)
     */

    // MAIN for testing
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Sum of N = " + sumOfN(5));
        System.out.println("Max = " + findMax(arr));
        System.out.println("Digit count of 12345 = " + countDigits(12345));
        System.out.println("Contains duplicate? " + containsDuplicate(arr));
        System.out.println("Binary Search for 3 = " + binarySearch(arr, 3));
        System.out.println("Factorial of 5 = " + fact(5));
        System.out.println("Fibonacci of 5 = " + fib(5));
        twoPointerPairSum(arr, 6);
        System.out.println("Is Palindrome (Iterative): " + isPalindromeIterative("madam"));
        System.out.println("Is Palindrome (Recursive): " + isPalindromeRecursive("madam", 0, 4));
    }
}
