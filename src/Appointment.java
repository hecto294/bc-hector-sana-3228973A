public class Appointment {
    private Patient patient;
    private doctor doctor;
    private EyeExam eyeExam;
    private String date;

    public Appointment(Patient patient, doctor doctor, EyeExam eyeExam, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.eyeExam = eyeExam;
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public doctor getDoctor() {
        return doctor;
    }

    public EyeExam getEyeExam() {
        return eyeExam;
    }

    public String getDate() {
        return date;
    }


    public String getSummary() {
        return "Appointment on " + date + "\n" +
                "Patient: " + patient.getName() + "\n" +
                "Doctor: " + doctor.getName() + "\n" +
                "Exam Type: " + eyeExam.getExamType();
    }
}
