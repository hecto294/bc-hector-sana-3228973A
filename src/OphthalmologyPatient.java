public class OphthalmologyPatient extends Patient {
    private String diagnosis;

    public OphthalmologyPatient(String name, int age, String id, String diagnosis) {
        super(name, age, id);
        this.diagnosis = diagnosis;
    }

    @Override
    public String getPatientInfo() {
        return "Ophthalmology Patient: " + name +
                ", Age: " + age +
                ", ID: " + id +
                ", Diagnosis: " + diagnosis;
    }
}
