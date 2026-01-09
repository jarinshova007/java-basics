// ParseInt method of string class
public class ParseInt {
    public static void main(String[] args) {
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number); // 123
        System.out.println(number - 3); // 120

        // some operations with parseInt and ToString
        int num = Integer.parseInt(str + 5);  // 1235
        String newStr = Integer.toString(num + 5);  //1240
        System.out.println(newStr + 19); // ans will be : 124019
    }
}
