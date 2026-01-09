/* Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 .....  */

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int fiboNm1 = fibonacci(N - 1);
        int fiboNm2 = fibonacci(N - 2);
        int fiboN = fiboNm1 + fiboNm2;
        return fiboN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The last number of the series: ");
        int lastNum = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i <= lastNum; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
        
    }
}
