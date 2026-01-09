// find maximum and minimum from a 2D arry and print them with indexes
import java.util.Scanner;

public class MaxAndMinOf2DArray {
    public static void main(String args[]) {
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
        // print
        System.out.print("arr: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int max = arr[0][0];
        int iMax = 0, jMax = 0;
        int min = arr[0][0];
        int iMin = 0, jMin = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    iMax = i;
                    jMax = j;
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    iMin = i;
                    jMin = j;
                }
            }
        }

        System.out.println("max = " + max + " idx: (" + iMax + "," + jMax + ")");
        System.out.println("min = " + min + " idx: (" + iMin + "," + jMin + ")");
    }
}