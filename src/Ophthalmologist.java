public class Ophthalmologist extends Doctor {

    public Ophthalmologist(String name) {
        super(name, "Ophthalmology");
    }

    @Override
    public String getDoctorInfo() {
        return "Ophthalmologist: " + name + " | Specialized in eye treatments";
    }

    // Polymorphic method
    public void performEyeExam(Patient patient) {
        System.out.println("Performing general eye exam on: " + patient.name);
    }

    // Polymorphic overload using subclass
    public void performEyeExam(OphthalmologyPatient patient) {
        System.out.println("Performing specialized eye exam on: " + patient.name +
                " | Diagnosis: " + patient.getPatientInfo());
    }
}
