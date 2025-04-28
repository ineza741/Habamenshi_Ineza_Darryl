package Question2;

public class RoomBooking extends HotelService {
    public RoomBooking(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        if (stayDays < 1 || stayDays > 30) {
            System.out.println("Error: Stay duration must be between 1 and 30 days");
            return;
        }

        if (!roomStatus.equals("AVAILABLE")) {
            System.out.println("Error: Room is not available for booking");
            return;
        }

        if (!roomType.equals("STANDARD") && !roomType.equals("DELUXE") && !roomType.equals("SUITE")) {
            System.out.println("Error: Invalid room type");
            return;
        }

        roomStatus = "OCCUPIED";
        System.out.println("\n=== Booking Confirmation ===");
        System.out.println("Guest: " + guestName + " (ID: " + guestId + ")");
        System.out.println("Room Type: " + roomType);
        System.out.println("Duration: " + stayDays + " days");
        System.out.println("Status: " + roomStatus);
    }

    @Override
    public void checkoutGuest() {} // Not implemented for this class

    @Override
    public void generateBill() {} // Not implemented for this class
}
