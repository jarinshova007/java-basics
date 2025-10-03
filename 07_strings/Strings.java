import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        // Concatenation (Joining 2 strings)
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // size
        int size = fullName.length();
        System.out.println("Size of array: " + size);

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println("Character at index (" + i + "): " + fullName.charAt(i));
        }

        // unicode number
        System.out.println("unicode numbers:");
        int a = 'a';
        System.out.println(a);
        char A = 'A';
        System.out.println((int)A);
        char space = ' ';
        System.out.println((int)space); // will print 32
        int spaces = ' ';
        System.out. println((char)spaces); // will print a space (' ');
        
        // compare
        if (firstName.compareTo(lastName) == 0) {
            System.out.println(firstName + " is equal to " + lastName);
        } else if (firstName.compareTo(lastName) > 0) {
            System.out.println(firstName + " is greater than " + lastName);
        } else if (firstName.compareTo(lastName) < 0) {
            System.out.println(lastName + " is greater than " + firstName);
        } 
        
        sc.close();

    }
}
