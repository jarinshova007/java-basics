import java.util.Scanner;

public class Table {
    public void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int num = sc.nextInt();

        Table t = new Table();
        t.printTable(num);

        sc.nextLine();
        
    }
}
