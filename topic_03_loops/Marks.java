/*
Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
If they enter 0 then stop.
If he/ she scores:
Marks >=90 -> print “This is Good”
89 <= Marks >= 60 -> print “This is also Good”
59 <= Marks >= 0 -> print “This is Good as well”
Because marks don’t matter but our effort does.
(Hint: use do-while loop but think & understand why)
 */
import java.util.Scanner;
// way 1 (with do while loop):
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter n 1 0r 0 for n: ");
            n = sc.nextInt();
            if (n == 1) {
                System.out.print("Enter marks (1-100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                }
            }
        } while (n != 0);
        
    }
}

/* way2 (with while loop):
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        int choice = 1;
        
        // no loop breaking logic needed
        while(choice == 1) {
            System.out.print("choice = ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("mark = ");
                marks = sc.nextInt();
                if (marks >= 0 && marks <= 59) {
                    System.out.println("good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("better");
                } else if (marks >= 90) {
                    System.out.println("best");
                }
            }
        }
        
    }
}
 */
/* way3 (with while loop):
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        int choice;

        while(true) {
            System.out.print("choice = ");
            choice = sc.nextInt();
            // loop breaking statement (because it's an infinite loop)
            if (choice == 0) {
                break;
            }
            if (choice == 1) {
                System.out.print("mark = ");
                marks = sc.nextInt();
                if (marks >= 0 && marks <= 59) {
                    System.out.println("good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("better");
                } else if (marks >= 90) {
                    System.out.println("best");
                }
            }
        }
        
    }
}
*/
