public class Main {
    public static void main(String[] args) {

        System.out.println("=== OPHTHALMOLOGY CLINIC SYSTEM ===\n");
        Patient p1 = new Patient("Ana Lopez", "1020456789", 30, false, 85000);
        Patient p2 = new Patient("Robert Miller", "87878787", 68, true, 95000);

        p1.showInfo();
        System.out.println();
        p2.showInfo();

        System.out.println("\nDiscount for Patient 1: $" + p1.calculateDiscount());
        System.out.println("Discount for Patient 2: $" + p2.calculateDiscount());
        EyeExam exam1 = new EyeExam("2025-03-10", "Retina Scan", 120000, p1);
        EyeExam exam2 = new EyeExam("2025-03-11", "Vision Test", 90000, p2);
        exam1.showExamInfo();
        System.out.println("Tax (IVA): $" + exam1.calculateTax());

        System.out.println();
        exam2.showExamInfo();
        System.out.println("Tax (IVA): $" + exam2.calculateTax());
    }
}




