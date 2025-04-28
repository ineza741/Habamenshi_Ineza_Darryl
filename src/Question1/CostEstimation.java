package Question1;

import java.text.NumberFormat;
import java.util.Locale;

public class CostEstimation extends ConstructionMaterial {
    public CostEstimation(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);
    }

    @Override
    public void receiveMaterial() {} // Not implemented for this class

    @Override
    public void useMaterial() {} // Not implemented for this class

    @Override
    public void estimateCost() {
        double costPerTon;
        if (materialQuantity >= 5 && materialQuantity <= 15) {
            costPerTon = 200000;
        } else if (materialQuantity > 15) {
            costPerTon = 180000;
        } else {
            System.out.println("Error: Cost estimation only available for quantities above 5 tons");
            return;
        }

        double totalCost = materialQuantity * costPerTon;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "RW"));
        formatter.setMaximumFractionDigits(0);

        System.out.println("\n--- Cost Estimation ---");
        System.out.println("Contractor ID: " + contractorId);
        System.out.println("Contractor Name: " + contractorName);
        System.out.println("Quantity Used: " + materialQuantity + " tons");
        System.out.println("Total Cost: " + formatter.format(totalCost));
    }
}
