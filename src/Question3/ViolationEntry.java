package Question3;

public class ViolationEntry extends TrafficRecord {
    public ViolationEntry(String driverId, String driverName, String vehiclePlate,
                          String violationType, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType, paymentStatus);
    }

    @Override
    public void recordViolation() {
        // Validate violation type
        if (!violationType.equals("SPEEDING") && !violationType.equals("RED_LIGHT") &&
                !violationType.equals("NO_HELMET") && !violationType.equals("DUI")) {
            System.out.println("Error: Invalid violation type");
            return;
        }

        // Validate driver ID (16 digits)
        if (driverId.length() != 16 || !driverId.matches("\\d+")) {
            System.out.println("Error: Driver ID must be 16 digits");
            return;
        }

        // Validate plate format (RAB123D pattern)
        if (!vehiclePlate.matches("[A-Z]{2,3}\\d{3}[A-Z]")) {
            System.out.println("Error: Invalid vehicle plate format");
            return;
        }

        paymentStatus = "UNPAID";
        System.out.println("\n=== Violation Recorded ===");
        System.out.println("Driver: " + driverName + " (ID: " + driverId + ")");
        System.out.println("Vehicle: " + vehiclePlate);
        System.out.println("Violation: " + violationType);
        System.out.println("Status: " + paymentStatus);
    }

    @Override
    public void assessFine() {} // Not implemented for this class

    @Override
    public void processPayment() {} // Not implemented for this class

}
