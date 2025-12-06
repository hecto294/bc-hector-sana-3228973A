package implementaciones;

import abstractas.MedicalService;
import interfaces.Schedulable;
import interfaces.Payable;

public class OphthalmologyConsultation extends MedicalService implements Schedulable, Payable {

    private int consultationDuration; // minutes
    private boolean hasInsurance;

    public OphthalmologyConsultation(String serviceName, double basePrice, String doctorInCharge,
                                     int consultationDuration, boolean hasInsurance) {

        super(serviceName, basePrice, doctorInCharge);
        this.consultationDuration = consultationDuration;
        this.hasInsurance = hasInsurance;
    }

    @Override
    public double calculateFinalCost() {
        double tax = basePrice * 0.19;
        return basePrice + tax;
    }

    @Override
    public String getDetailedDescription() {
        return "General ophthalmology consultation lasting " + consultationDuration + " minutes.";
    }

    // Schedulable
    @Override
    public boolean checkAvailability(String date) {
        return true;
    }

    @Override
    public void schedule(String patientName, String date) {
        System.out.println("Consultation scheduled for " + patientName + " on " + date);
    }

    @Override
    public void cancelSchedule(String date) {
        System.out.println("Consultation canceled for date: " + date);
    }

    // Payable
    @Override
    public double applyDiscount(double percentage) {
        return basePrice - (basePrice * percentage / 100);
    }

    @Override
    public boolean isEligibleForDiscount() {
        return hasInsurance;
    }

    @Override
    public String generateInvoice() {
        return "Invoice for consultation: $" + calculateFinalCost();
    }
}
