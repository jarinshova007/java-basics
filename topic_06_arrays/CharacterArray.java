import java.util.Scanner;

public class CharacterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char name[] = new char[5];

        // scan
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next().charAt(0);
        }

        // print
        for (char c : name) {
            System.out.print(c);
        }

        // for (int i = 0; i < name.length; i++) {
        // System.out.print(name[i]);
        // }
    }
}