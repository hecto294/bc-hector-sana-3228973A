package abstractas;

public abstract class MedicalService {

    protected String serviceName;
    protected double basePrice;
    protected String doctorInCharge;

    public MedicalService(String serviceName, double basePrice, String doctorInCharge) {
        this.serviceName = serviceName;
        this.basePrice = basePrice;
        this.doctorInCharge = doctorInCharge;
    }

    // ABSTRACT METHODS
    public abstract double calculateFinalCost();
    public abstract String getDetailedDescription();

    // CONCRETE METHOD
    public void showBasicInfo() {
        System.out.println("=== Medical Service Information ===");
        System.out.println("Service: " + serviceName);
        System.out.println("Doctor: " + doctorInCharge);
        System.out.println("Base Price: $" + basePrice);
    }

    // GETTERS
    public String getServiceName() { return serviceName; }
    public double getBasePrice() { return basePrice; }
    public String getDoctorInCharge() { return doctorInCharge; }
}


