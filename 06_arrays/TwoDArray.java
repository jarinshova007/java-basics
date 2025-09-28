// read and print a 2D array
import java.util.*;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row num: ");
        int row = sc.nextInt();
        System.out.print("Column num: ");
        int col = sc.nextInt();
        
        int arr[][] = new int[row][col];

        // input
        System.out.println("Take input for the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // print
        System.out.println("Print the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
