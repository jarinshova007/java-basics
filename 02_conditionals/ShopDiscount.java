/* Question:
A shop provides discount based on purchase amount:

If purchase ≥ 5000 → 20% discount

If purchase ≥ 3000 → 10% discount

If purchase ≥ 1000 → 5% discount

Otherwise → No discount 
-> Find the Net Amount after discount  */

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Purchase Amount: ");
        int purchaseAmount = sc.nextInt();

        int netAmount = purchaseAmount;
        if (purchaseAmount >= 5000) {
            netAmount -= 20 * purchaseAmount / 100;
        } else if (purchaseAmount >= 3000) {
            netAmount -= 10 * purchaseAmount / 100;
        } else if (purchaseAmount >= 1000) {
            netAmount -= 5 * purchaseAmount / 100;
        }
        System.out.println("Net Amount: " + netAmount);
    }
}
