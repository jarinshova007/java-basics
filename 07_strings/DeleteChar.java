/* Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example :
email = “LearningJava@gmail.com” ; username = “LearningJava”
email = “HelloWorld123@gmail.com”; username = “HelloWorld123” */

import java.util.Scanner;

public class DeleteChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("email: ");
        String email = sc.next();

        // traverse
        /*String temp = " ";
        for (int i = email.length() - 1; i >= 10; i--) {
            temp += email.charAt(i);
        }

        String username = email - temp;
        System.out.println("username: " + username);*/ 
        String username = " ";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println("username: " + username);
    }
}
