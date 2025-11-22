import java.util.Scanner;

public class DiagonalSum {
    public static int diagonalSum(int arr[][]) {
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[i].length; i++) {
                if(i == j) {
                    mainDiagonalSum += arr[i][j];
                }
                if (i + j == (arr.length - 1)) {
                    secondaryDiagonalSum += arr[i][j];
                }
            }
        }
        return mainDiagonalSum + secondaryDiagonalSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();
        System.out.print("col: ");
        int col = sc.nextInt();

        //array
        int array[][] = new int[row][col];
        // scan array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // diagonal sum
        diagonalSum(array);
    }
}