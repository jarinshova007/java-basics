import java.util.Scanner;

public class SumAndAvgOfTwo2dArray {
    public static int sumOfTwoDArray(int arr[][]) {
            int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();
        System.out.print("col: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = sumOfTwoDArray(arr);
        double avg = (double) sum / (double) (row * col);
        System.out.println("sum: " + sum);
        System.out.printf("Average: %.2f", avg);
    }
}
