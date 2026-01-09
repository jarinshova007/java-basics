// Ask the user to enter the number of the day in a week and print the name of the day

import java.util.Scanner;

public class DaysInAWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Friday");
                break;
        }
    }
}