import java.util.InputMismatchException;
import java.util.Scanner;

public class Combined {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        String str = null;
        String str1 = "123a";
        try {
            System.out.print("Enter an integer num: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);

            int b = 0;

            int result = num / b;
            System.out.println("result: " + result); 

            
            System.out.println("lenth of str: " + str.length());

            System.out.println("Array element: " + arr[4]);

            int string = Integer.parseInt(str1);
            System.out.println("String to integer: " + string);
        } catch (InputMismatchException e) {
            System.out.println("Please inter a valid integer number!");
        } catch (ArithmeticException e) {
            System.out.println("something divided by zero is infinity!");
        } catch (NullPointerException e) {
            System.out.println("It's a null String!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index!");
        } catch (NumberFormatException e) {
            System.out.println("cannot conver this String to integer!");
        } finally {
            System.out.println("Program runs successfully!");
        }
    }
}
