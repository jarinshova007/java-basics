// For a given matrix of N x M, print its transpose
import java.util.Scanner;

public class TransposeArray {
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
        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("col = ");
        int col = sc.nextInt();

        int array[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // create transpose array
        int transpose[][] = new int[col][row];

        for(int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = array[j][i];
            }
        }

        // output array
        System.out.println("array:");
        printArray(array);
        System.out.println();
        // output transpose array
        System.out.println("transpose array:");
        printArray(transpose);
        
        sc.close();
        
    }
}
