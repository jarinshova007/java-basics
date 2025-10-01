// Reverse a String with String builder
public class ReverseSB {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);

        // manual reverse
        for (int i = 0; i <= sb.length() / 2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - 1 - i));
            sb.setCharAt(sb.length() - 1 - i, temp);
        }
        System.out.println(sb);

        // Reverse the string
        sb.reverse();
        System.out.println(sb); // again Hello World
    }
}
