import java.util.Scanner;

public class ShipCostCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price, shippingCost, totalCost;

        System.out.print("Enter the price of the item: ");
        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine(); // clear the buffer

            if (price >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = price * 0.02;
            }

            totalCost = price + shippingCost;

            System.out.println("Shipping Cost: $" + shippingCost);
            System.out.println("Total Cost: $" + totalCost);
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input. You entered: " + trash);
        }
    }
}