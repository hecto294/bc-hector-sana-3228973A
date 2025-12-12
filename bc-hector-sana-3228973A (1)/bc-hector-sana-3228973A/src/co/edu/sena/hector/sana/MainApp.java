package co.edu.sena.hector.sana;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Clínica Oftalmológica - Proyecto Semana 1 a 4");

        Patient p = new Patient("123", "Héctor Sana", 30);
        OphthalmologyPatient op = new OphthalmologyPatient("456", "Laura Pérez", 27, "Miopía");
        Appointment a = new Appointment("A01", p, "2025-01-10");
        EyeExam exam = new EyeExam(op, 1.5, 1.25);

        System.out.println(p);
        System.out.println(op);
        System.out.println(a);
        System.out.println(exam);
    }
}
