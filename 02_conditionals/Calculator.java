// Make a calculator. Take two numbers (a & b) from the user and an operation: (+ or - or * or / or %)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        
        System.out.print("n = ");
        int n = sc.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("a + b = " + (a + b));      
                break;       
            case 2:
                System.out.println("a - b = " + (a - b));
                break;
            case 3:
                int mul = a * b;
                System.out.println("a * b = " + mul);
                break;       
            case 4: 
                int div = a / b;
                System.out.println("a / b = " + div);
                break;   
            default:
                int remainder = a % b;
                System.out.println("a % b = " + remainder);
                break;
            }
        
        sc.close();
        
    }
}
