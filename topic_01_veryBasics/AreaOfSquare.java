import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a side of a square: ");
        double side = sc.nextDouble();

        System.out.printf("The area of the circle: %.2f\n", side * side);

        sc.close();
    }
}