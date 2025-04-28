package Question2;

import java.util.Scanner;

public class LemigoHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LEMIGO HOTEL MANAGEMENT SYSTEM ===");
        System.out.print("Enter Guest ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Guest Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Room Type (STANDARD/DELUXE/SUITE): ");
        String type = scanner.nextLine();

        System.out.println("\n1. Room Booking");
        System.out.println("2. Guest Checkout");
        System.out.println("3. Generate Bill");
        System.out.print("Select operation (1-3): ");
        int choice = scanner.nextInt();

        int days = 1;
        if (choice == 1 || choice == 3) {
            System.out.print("Enter Stay Duration (days): ");
            days = scanner.nextInt();
        }

        System.out.print("Enter Current Room Status (AVAILABLE/OCCUPIED): ");
        scanner.nextLine(); // consume newline
        String status = scanner.nextLine();

        switch (choice) {
            case 1:
                RoomBooking booking = new RoomBooking(id, name, type, days, status);
                booking.bookRoom();
                break;
            case 2:
                GuestCheckout checkout = new GuestCheckout(id, name, type, days, status);
                checkout.checkoutGuest();
                break;
            case 3:
                Billing bill = new Billing(id, name, type, days, status);
                bill.generateBill();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
