package implementaciones;

import abstractas.MedicalService;
import interfaces.Reportable;

public class OpticalExam extends MedicalService implements Reportable {

    private boolean includesRetinaScan;

    public OpticalExam(String serviceName, double basePrice, String doctorInCharge,
                       boolean includesRetinaScan) {

        super(serviceName, basePrice, doctorInCharge);
        this.includesRetinaScan = includesRetinaScan;
    }

    @Override
    public double calculateFinalCost() {
        double extra = includesRetinaScan ? 30 : 0;
        return basePrice + extra;
    }

    @Override
    public String getDetailedDescription() {
        return "Optical exam" + (includesRetinaScan ? " with retina scan." : ".");
    }

    @Override
    public String generateMedicalReport() {
        return "Optical exam results indicate normal ocular behavior.";
    }

    @Override
    public String getReportSummary() {
        return "Summary: No visual anomalies detected.";
    }
}
