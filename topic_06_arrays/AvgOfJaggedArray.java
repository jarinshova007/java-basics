
import java.util.Scanner;

public class AvgOfJaggedArray {
    public static void printArray(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int prinSum(int arr[][]) {
        int sum = 0;
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
    // average with method
    public static double avg(int arr[][], int element) {
        int sum = prinSum(arr);
        double avg = (float) sum / (float) element;
        return avg;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("total row: ");
        int row = sc.nextInt();

        int jagged[][] = new int[row][];

        int totalElement = 0;
        // scan
        for (int i = 0; i < row; i++) {
            System.out.print("col in row " + (i + 1) + ": ");
            int col = sc.nextInt();

            jagged[i] = new int[col];
            
            for (int j = 0; j < col; j++) {
                jagged[i][j] = sc.nextInt();
                totalElement++;
            }
        }

        // print jagged Array
        System.out.println("The jagged array:");
        printArray(jagged);

        // print the sum
        int sum = prinSum(jagged);
        System.out.println("sum of the jagged array: " + sum);

        // print the average
        // with method:
        double avg = avg(jagged, totalElement);
        System.out.println("Average of the jagged array: " + avg);
        // manually
        double average = (double) sum / (double) totalElement;
        System.out.println("Average of the jagged array: " + average);

    }
}
