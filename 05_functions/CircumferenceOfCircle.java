// Write a function that takes in the radius as input and returns the circumference of a circle
import java.util.Scanner;

public class CircumferenceOfCircle {
    static double circumference(double r) {
        return (2 * 3.1416 * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("radius : ");
    double radius = sc.nextDouble();
    System.out.printf("The circumference of the circle: %.2f", circumference(radius));

    sc.close();

    }
}
