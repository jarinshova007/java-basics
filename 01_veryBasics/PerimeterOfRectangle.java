import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of a rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of a rectangle: ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.printf("The perimeter of the rectangle: %.2f\n", perimeter);

        sc.close();
    }
}