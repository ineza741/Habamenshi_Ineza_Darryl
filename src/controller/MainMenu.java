package controller;


import Question1.RealConstructor;
import Question2.LemigoHotel;
import Question3.RwandaPolice;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ASSIGNMENT MENU ===");
            System.out.println("1. Run Question 1 (Construction)");
            System.out.println("2. Run Question 2 (Hotel)");
            System.out.println("3. Run Question 3 (Police)");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear buffer
                continue;
            }

            switch (choice) {
                case 1:
                    RealConstructor.main(new String[]{});
                    break;
                case 2:
                    LemigoHotel.main(new String[]{});
                    break;
                case 3:
                    RwandaPolice.main(new String[]{});
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
