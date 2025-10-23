import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        int fibo_Nm1 = fibonacci(N - 1);
        int fibo_Nm2 = fibonacci(N - 2);
        int fibo_N = fibo_Nm1 + fibo_Nm2;

        return fibo_N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("lastNum: ");
        int lastNum = sc.nextInt();

        for (int i = 0; i <= lastNum; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
