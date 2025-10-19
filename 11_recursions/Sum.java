// Print sum of first n natural numbers
import java.util.Scanner;

public class Sum {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
       // System.out.println(i); // for printing (4 3 2 1)
    }

    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("sum of 1 to " + n + " = ");
        printSum(1, n, 0);
    }
}
