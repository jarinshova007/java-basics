/* Print the spiral order matrix as output for a given matrix of number:
        1  5  7  9  10 11
        6  10 12 13 20 21
        9  25 29 30 32 41
        15 55 59 63 68 70
        40 70 79 81 95 105
 */

import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt(); // 5
        System.out.print("col: ");
        int col = sc.nextInt(); // 6

        int arr[][] = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Spiral order: ");
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        while (top <= bottom && left <= right) {
            // left -> right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // top -> bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}