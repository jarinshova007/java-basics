import java.util.Scanner;

public class SumAndAvgOfArray {
    public static int sumOfArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size : ");
        int size = sc.nextInt();
        int array[] = new int[size];

        // taking input
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int sum = sumOfArray(array);
        System.out.println("Sum of the array: " + sum);

        float avg = (float) sum / (float) array.length;
        System.out.printf("Average of the array : %.2f" ,avg);
    }
}
