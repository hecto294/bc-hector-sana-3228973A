package implementaciones;

import abstractas.MedicalService;
import interfaces.Schedulable;
import interfaces.Payable;
import interfaces.Reportable;

public class EyeSurgery extends MedicalService implements Schedulable, Payable, Reportable {

    private int surgeryDuration;
    private double anesthesiaCost;

    public EyeSurgery(String serviceName, double basePrice, String doctorInCharge,
                      int surgeryDuration, double anesthesiaCost) {

        super(serviceName, basePrice, doctorInCharge);
        this.surgeryDuration = surgeryDuration;
        this.anesthesiaCost = anesthesiaCost;
    }

    @Override
    public double calculateFinalCost() {
        double tax = (basePrice + anesthesiaCost) * 0.19;
        return basePrice + anesthesiaCost + tax;
    }

    @Override
    public String getDetailedDescription() {
        return "Eye surgery lasting " + surgeryDuration + " minutes with specialized ophthalmic equipment.";
    }

    // Schedulable
    @Override
    public boolean checkAvailability(String date) { return true; }

    @Override
    public void schedule(String patientName, String date) {
        System.out.println("Surgery scheduled for " + patientName + " on " + date);
    }

    @Override
    public void cancelSchedule(String date) {
        System.out.println("Surgery canceled on: " + date);
    }

    // Payable
    @Override
    public double applyDiscount(double percentage) {
        return calculateFinalCost() - (calculateFinalCost() * percentage / 100);
    }

    @Override
    public boolean isEligibleForDiscount() {
        return false; // surgeries normally have no discount
    }

    @Override
    public String generateInvoice() {
        return "Surgery invoice: $" + calculateFinalCost();
    }

    // Reportable
    @Override
    public String generateMedicalReport() {
        return "Post-surgery report: Patient stable, no complications.";
    }

    @Override
    public String getReportSummary() {
        return "Summary: Successful ophthalmic surgery.";
    }
}
