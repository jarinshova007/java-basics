// find an integer number x from a 2D array

import java.util.Scanner;

public class TraverseIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("column = ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // print the array
        System.out.println("The array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("x = ");
        int x = sc.nextInt();

        // traverse
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == x) {
                    System.out.println(x + " is found at index: (" + i + ", " + j + ")");
                    return;
                }
            }
        }

        System.out.println(x + " is not found");

        sc.close();
    }
}
