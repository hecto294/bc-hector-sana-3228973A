public class Main {
    public static void main(String[] args) {


        Patient generalPatient = new Patient("Daniel Torres", 40, "P001");

        OphthalmologyPatient eyePatient =
                new OphthalmologyPatient("Laura Medina", 29, "P002", "Myopia");

        Patient polyPatient = new OphthalmologyPatient("Samuel Diaz", 35, "P003", "Cataract");

        Ophthalmologist doctor = new Ophthalmologist("Dr. Herrera");


        Appointment appointment = new Appointment();



        appointment.createAppointment("Laura Medina");
        appointment.createAppointment("Laura Medina", "2025-01-12");
        appointment.createAppointment("Laura Medina", "2025-01-12", "Herrera");


        System.out.println(generalPatient.getPatientInfo());
        System.out.println(eyePatient.getPatientInfo());
        System.out.println(polyPatient.getPatientInfo());



        doctor.performEyeExam(generalPatient);
        doctor.performEyeExam(eyePatient);

        System.out.println(doctor.getDoctorInfo());
    }
}
