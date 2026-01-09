import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Number2: ");
        int num2 = sc.nextInt();

        int remainder = num1 % num2;

        System.out.println("Remainder = " + remainder);

        sc.close();
        
    }
}