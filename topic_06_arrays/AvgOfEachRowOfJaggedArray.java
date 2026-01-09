// print the sum and everage of each row of a jagged array
import java.util.Scanner;

public class AvgOfEachRowOfJaggedArray {
    public static void printArray(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("total row: ");
        int row = sc.nextInt();
        
        int jagged[][] = new int[row][];
        // scan
        for (int i = 0; i < row; i++) {
            System.out.print("col in row " + (i + 1) + ": ");
            int col = sc.nextInt();
            jagged[i] = new int[col];

            int sum = 0;
            int total = 0;
            double avg = 0.0;
            for (int j = 0; j < col; j++) {
                jagged[i][j] = sc.nextInt();
                sum += jagged[i][j];
                total = col;
                avg = (double) sum / (double) (total);
            }
            System.out.println("sum of this row: " + (i + 1) + ": " + sum);
            System.out.println("average of row: " + (i + 1) + ": " + avg);
        }

    }
}
