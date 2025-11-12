// Reverse a String with String builder
public class ReverseSB {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);

        // manual reverse
        for (int i = 0; i < sb.length() / 2; i++) {
            char front = sb.charAt(i);
            char back = sb.charAt(sb.length ()- i - 1);

            // set char
            sb.setCharAt(i, back);
            sb.setCharAt(sb.length() - 1 - i, front);
        }
        System.out.println(sb);
        
        // Reverse the string
        System.out.println(sb.reverse());// again Hello World
        
        // String Builder to lower/upper case
        System.out.println(sb.toString().toLowerCase());  // hello world
        System.out.println(sb.toString().toUpperCase());  // HELLO WORLD
    }
}
