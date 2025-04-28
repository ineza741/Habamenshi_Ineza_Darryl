package Question3;

public abstract class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId, String driverName, String vehiclePlate,
                         String violationType, String paymentStatus) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType.toUpperCase();
        this.paymentStatus = paymentStatus.toUpperCase();
        this.fineAmount = 0;
    }

    public abstract void recordViolation();
    public abstract void assessFine();
    public abstract void processPayment();
}
