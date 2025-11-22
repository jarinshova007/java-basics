import java.util.Scanner;

public class ShiftStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = new String(sc.nextLine());

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (ch == 'z') ? 'a' : (char) (ch + 1);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (ch == 'Z') ? 'A' : (char) (ch + 1);
            }
            sb.setCharAt(i, ch);
        }
        System.out.println(sb);
    }
}
