package Question2;

public class GuestCheckout extends HotelService {
    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {} // Not implemented for this class

    @Override
    public void checkoutGuest() {
        if (!roomStatus.equals("OCCUPIED")) {
            System.out.println("Error: Room is not currently occupied");
            return;
        }

        roomStatus = "AVAILABLE";
        System.out.println("\n=== Checkout Processed ===");
        System.out.println("Guest: " + guestName + " (ID: " + guestId + ")");
        System.out.println("Room Type: " + roomType);
        System.out.println("Status: " + roomStatus);
    }

    @Override
    public void generateBill() {} // Not implemented for this class
}
