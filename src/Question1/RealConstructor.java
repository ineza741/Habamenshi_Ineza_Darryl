package Question1;

import java.util.Scanner;

public class RealConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REAL CONSTRUCTOR - Construction Site Management ===");
        System.out.print("Enter Contractor ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Contractor Name: ");
        String name = scanner.nextLine();

        System.out.println("\n1. Material Delivery");
        System.out.println("2. Material Usage");
        System.out.println("3. Cost Estimation");
        System.out.print("Select operation (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter material quantity (tons): ");
        double quantity = scanner.nextDouble();

        switch (choice) {
            case 1:
                MaterialDelivery delivery = new MaterialDelivery(id, name, quantity);
                delivery.receiveMaterial();
                break;
            case 2:
                MaterialUsage usage = new MaterialUsage(id, name, quantity);
                System.out.print("Enter current material balance: ");
                double balance = scanner.nextDouble();
                usage.materialBalance = balance;
                usage.useMaterial();
                break;
            case 3:
                CostEstimation cost = new CostEstimation(id, name, quantity);
                cost.estimateCost();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
