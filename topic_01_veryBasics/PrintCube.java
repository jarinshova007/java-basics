import java.util.Scanner;

public class PrintCube {
public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);

    System.out.print("Enter an integer number: ");
    int num = sc.nextInt();

    int cube = num * num * num;
    System.out.println("The cube of the number: " + cube);

    sc.close();
    
    }
}

