import abstractas.MedicalService;
import implementaciones.EyeSurgery;
import implementaciones.OphthalmologyConsultation;
import implementaciones.OpticalExam;
import interfaces.Payable;
import interfaces.Reportable;
import interfaces.Schedulable;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== OPHTHALMOLOGY CLINIC SYSTEM ===\n");

        // Polymorphism with abstract class
        MedicalService[] services = new MedicalService[3];

        services[0] = new OphthalmologyConsultation(
                "General Consultation", 80, "Dr. Morales", 30, true);

        services[1] = new EyeSurgery(
                "Cataract Surgery", 1500, "Dr. Ramirez", 90, 300);

        services[2] = new OpticalExam(
                "Basic Optical Exam", 50, "Dr. Lopez", true);

        // Demonstration
        for (MedicalService s : services) {
            s.showBasicInfo();
            System.out.println(s.getDetailedDescription());
            System.out.println("Final Cost: $" + s.calculateFinalCost());
            System.out.println("----------------------------------------");
        }

        System.out.println("\n=== INTERFACE DEMO ===");

        // Schedulable example
        Schedulable schedulable = new OphthalmologyConsultation(
                "Control Consultation", 70, "Dr. Vega", 20, true);

        schedulable.schedule("John Doe", "2025-01-15");

        // Payable example
        Payable payable = new EyeSurgery(
                "Laser Surgery", 1200, "Dr. Martinez", 60, 200);

        System.out.println("Discount eligible? " + payable.isEligibleForDiscount());
        System.out.println("Invoice: " + payable.generateInvoice());

        // Reportable example
        Reportable reportable = new OpticalExam(
                "Advanced Exam", 75, "Dr. Lopez", false);

        System.out.println(reportable.generateMedicalReport());
    }
}
