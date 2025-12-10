// Print the sum of two 2x2 array
import java.util.Scanner;

public class Add2TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();
        System.out.print("col: ");
        int col = sc.nextInt();

        // 1st array
        System.out.println("1st array:");
        int arr1[][] = new int[row][col];
        // scan
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // 2nd array
        System.out.println("2nd array:");
        int arr2[][] = new int[row][col];
        // scan
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // 3rd array
        int arr3[][] = new int[row][col];
        // scan
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println();

        // print arr3
        System.out.println("The sum of array1 & array2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
