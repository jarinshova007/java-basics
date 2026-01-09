import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number1: ");
        float num1 = sc.nextFloat();
        System.out.print("Number2: ");
        float num2 = sc.nextFloat();

        float sum = num1 + num2;

        System.out.println("Summation = " + sum);

        sc.close();
        
    }
}