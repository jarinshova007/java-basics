// Make a function to check if a number is Even or Odd

import java.util.Scanner;

public class EvenOrNot {
    public boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();
    
        EvenOrNot e = new EvenOrNot();
        if (e.isEven(num)) {
            System.out.println("An even number");
        } else {
            System.out.println("An odd number");
        }

        sc.close();
        
    }
}
