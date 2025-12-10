public class ArithMaticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
        int result = a / b;
        System.out.println("result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("someting divided by zero is infinity!");
        }
        finally {
            System.out.println("program continues...");
        }
    }
}
