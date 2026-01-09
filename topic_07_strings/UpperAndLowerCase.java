public class UpperAndLowerCase {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        // StringBuilder to String (as only Strings have upper & lower case)
        String str = sb.toString();
        System.out.println("string: " + str);

        // upper case
        System.out.println("upper case: " + str.toUpperCase());

        // lower case
        System.out.println("lower case: " + str.toLowerCase());
    }
}
