package Question1;

public class MaterialUsage extends ConstructionMaterial {
    public MaterialUsage(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);
    }

    @Override
    public void receiveMaterial() {} // Not implemented for this class

    @Override
    public void useMaterial() {
        if (materialBalance - materialQuantity >= 2) {
            materialBalance -= materialQuantity;
            System.out.println("Material used. Remaining balance: " + materialBalance + " tons");
        } else {
            System.out.println("Error: Insufficient material. Minimum 2 tons must remain after usage");
        }
    }

    @Override
    public void estimateCost() {} // Not implemented for this class

}
