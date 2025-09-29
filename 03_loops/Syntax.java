// Syntax of different s
public class Syntax {
    public static void main(String[] args) {
        // for loop
        System.out.println("for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Hello World");
        }

        // while loop
        System.out.println("while loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i + ". Hello World");
            i++;
        }

        // do while loop
        System.out.println("do while loop:");
        int j = 1;
        do {
            System.out.println(j + ". Hello World");
            j++;
        } while (j <= 5);
    }
}
