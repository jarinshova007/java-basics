// Manually reverse a String

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str: ");
        String str = new String(sc.nextLine());

        // a new empty string
        String revStr = new String();

        // traverse from the last to 0th index
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        System.out.println("reverse str: " + revStr);

        sc.close();
        
    }
}
