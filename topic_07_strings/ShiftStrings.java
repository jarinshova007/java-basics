// abcEfG to bcdFgH
import java.util.Scanner;

public class ShiftStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = new String(sc.nextLine());

        // if I want a to b
        // int asciiValOfa = (int) 'a';
        // char b = (char) (asciiValOfa + 1);
        // or,
        // char b = (char) ('a' + 1); both are same

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (ch == 'z') ? 'a' : (char) (ch + 1); // it could be stored in another pre declared
                                                          // char ch1 = ch; then ch1 = (ch == 'z') ? 'a' : (char) (ch + 1);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (ch == 'Z') ? 'A' : (char) (ch + 1);
            }
            sb.setCharAt(i, ch);
        }
        System.out.println(sb);
    }
}
