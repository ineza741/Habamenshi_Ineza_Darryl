package Question3;

import java.text.NumberFormat;
import java.util.Locale;

public class FinePayment extends TrafficRecord {
    public FinePayment(String driverId, String driverName, String vehiclePlate,
                       String violationType, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType, paymentStatus);
    }

    @Override
    public void recordViolation() {} // Not implemented for this class

    @Override
    public void assessFine() {} // Not implemented for this class

    @Override
    public void processPayment() {
        if (fineAmount <= 0) {
            System.out.println("Error: Fine amount not assessed or invalid");
            return;
        }

        if (paymentStatus.equals("PAID")) {
            System.out.println("Error: Fine has already been paid");
            return;
        }

        paymentStatus = "PAID";
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "RW"));
        formatter.setMaximumFractionDigits(0);

        System.out.println("\n=== Payment Receipt ===");
        System.out.println("Driver: " + driverName);
        System.out.println("Vehicle Plate: " + vehiclePlate);
        System.out.println("Violation: " + violationType);
        System.out.println("Amount Paid: " + formatter.format(fineAmount));
        System.out.println("Payment Status: " + paymentStatus);
    }

}
