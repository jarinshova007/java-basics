import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str: ");
        String str = new String(sc.nextLine());
        
        for (int i = 0; i < str.length() / 2; i++) {
            char left = str.charAt(i);
            char right = str.charAt(str.length() - 1 - i);

            if (left != right) {
                System.out.println("not a palindrome");
                return;
            }
        }

        System.out.println("plaindrome");

        sc.close();

    }
}