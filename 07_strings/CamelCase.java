import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str = ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        // lower case
        String strLower = sb.toString().toLowerCase();
        // split by space
        String words[] = sb.toString().split(" ");

        StringBuilder newSb = new StringBuilder();

        // adding the first word
        newSb.append(words[0]);

        // actual operation
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() == 0) {
                continue;
            }

            StringBuilder temp = new StringBuilder(words[i]);
            char first = temp.charAt(0);
            temp.setCharAt(0, Character.toUpperCase(first));

            // adding to the newSb
            newSb.append(temp);
        }
        System.out.println(sb);
        System.out.println(newSb);
    }
}