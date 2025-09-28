
import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        final float PI = 3.14F;
        float area = PI * radius * radius;

        System.out.println("The area of the circle: " + area);

        sc.close();

    }
}