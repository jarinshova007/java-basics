// For a given matrix of N x M, print its transpose
import java.util.Scanner;

public class TransposeArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt(); // 5
        System.out.print("col: ");
        int col = sc.nextInt(); // 6

        int arr[][] = new int[row][col];

        // input
        System.out.println("Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // create transpose array
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // output transpose array
        System.out.println("Transpose Array:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}
