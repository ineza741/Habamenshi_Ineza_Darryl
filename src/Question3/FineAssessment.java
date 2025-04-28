package Question3;

import java.text.NumberFormat;
import java.util.Locale;

public class FineAssessment extends TrafficRecord {
    public FineAssessment(String driverId, String driverName, String vehiclePlate,
                          String violationType, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType, paymentStatus);
    }

    @Override
    public void recordViolation() {} // Not implemented for this class

    @Override
    public void assessFine() {
        switch (violationType) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println("Error: Unrecognized violation type");
                return;
        }

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "RW"));
        formatter.setMaximumFractionDigits(0);

        System.out.println("\n=== Fine Assessment ===");
        System.out.println("Driver: " + driverName + " (ID: " + driverId + ")");
        System.out.println("Vehicle: " + vehiclePlate);
        System.out.println("Violation: " + violationType);
        System.out.println("Fine Amount: " + formatter.format(fineAmount));
    }

    @Override
    public void processPayment() {} // Not implemented for this class
}
