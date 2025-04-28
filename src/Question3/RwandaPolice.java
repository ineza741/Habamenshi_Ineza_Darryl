package Question3;

import java.util.Scanner;

public class RwandaPolice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RWANDA NATIONAL POLICE - Traffic Fine System ===");
        System.out.print("Enter Driver ID (16 digits): ");
        String id = scanner.nextLine();
        System.out.print("Enter Driver Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
        String plate = scanner.nextLine().toUpperCase();

        System.out.println("\n1. Record Violation");
        System.out.println("2. Assess Fine");
        System.out.println("3. Process Payment");
        System.out.print("Select operation (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String violation = "";
        String status = "UNPAID";

        if (choice == 1 || choice == 2) {
            System.out.print("Enter Violation Type (SPEEDING/RED_LIGHT/NO_HELMET/DUI): ");
            violation = scanner.nextLine().toUpperCase();
        }

        if (choice == 3) {
            System.out.print("Enter Violation Type: ");
            violation = scanner.nextLine().toUpperCase();
            System.out.print("Enter Current Payment Status (PAID/UNPAID): ");
            status = scanner.nextLine().toUpperCase();
        }

        switch (choice) {
            case 1:
                ViolationEntry entry = new ViolationEntry(id, name, plate, violation, status);
                entry.recordViolation();
                break;
            case 2:
                FineAssessment assessment = new FineAssessment(id, name, plate, violation, status);
                assessment.assessFine();
                break;
            case 3:
                FinePayment payment = new FinePayment(id, name, plate, violation, status);
                System.out.print("Enter Fine Amount: ");
                payment.fineAmount = scanner.nextDouble();
                payment.processPayment();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
