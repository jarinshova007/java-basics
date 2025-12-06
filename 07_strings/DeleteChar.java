/* Input an email from the user. You have to create a username, a domain name and (name + .com) from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example :
email = “LearningJava@gmail.com” ; username = “LearningJava”
email = “HelloWorld123@gmail.com”; username = “HelloWorld123” */

import java.util.Scanner;

public class DeleteChar {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("email: "); 
        String email = "jarinshova007@gmail.com";

        /* manually find the index
        int idx = -1;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                idx = i;
            }
        } */

        int idx = email.indexOf('@');

        // username
        String userName = email.substring(0, idx);
        System.out.println("user name: " + userName);

        // domain name
        String domainName = email.substring(idx + 1);
        System.out.println("domain name: " + domainName);
        
        // remove the middle portion (007@gmail)

        // index of 0
        int idxOfZero = email.indexOf('0');
        String firstHalf = email.substring(0, idxOfZero);

        // index of .
        int idxOfDot = email.indexOf('.');
        String lastHalf = email.substring(idxOfDot);

        // concat or add the firstHalf or lastHalf

        //String str = firstHalf + lastHalf; (another way)
        String str = firstHalf.concat(lastHalf);
        System.out.println("name + .com portion: " + str);

        sc.close();
        
    }
}
