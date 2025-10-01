/* Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
Example :
original = “eabcdef" ; result = “iabcdif”
Original = “xyz” ; result = “xyz” */

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str = ");
        String str = sc.next();

        // traverse
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println("result = " + result);

        sc.close();
        
    }
}