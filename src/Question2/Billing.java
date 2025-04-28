package Question2;

import java.text.NumberFormat;
import java.util.Locale;

public class Billing extends HotelService {
    public Billing(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {} // Not implemented for this class

    @Override
    public void checkoutGuest() {} // Not implemented for this class

    @Override
    public void generateBill() {
        int rate;
        switch (roomType) {
            case "STANDARD":
                rate = 50000;
                break;
            case "DELUXE":
                rate = 80000;
                break;
            case "SUITE":
                rate = 120000;
                break;
            default:
                System.out.println("Error: Invalid room type for billing");
                return;
        }

        if (stayDays < 1) {
            System.out.println("Error: Invalid stay duration");
            return;
        }

        int total = rate * stayDays;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "RW"));
        formatter.setMaximumFractionDigits(0);

        System.out.println("\n=== Hotel Bill ===");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Guest ID: " + guestId);
        System.out.println("Room Type: " + roomType);
        System.out.println("Days Stayed: " + stayDays);
        System.out.println("Nightly Rate: " + formatter.format(rate));
        System.out.println("Total Cost: " + formatter.format(total));
    }
}
