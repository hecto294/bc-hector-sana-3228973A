public class Appointment {


    private Patient patient;
    private Doctor doctor;
    private EyeExam eyeExam;
    private String date; // scheduled date


    public Appointment(Patient patient, Doctor doctor, EyeExam eyeExam, String date) {
        setPatient(patient);
        setDoctor(doctor);
        setEyeExam(eyeExam);
        setDate(date);
    }


    public Appointment(Patient patient, Doctor doctor, String date) {
        this(patient, doctor, null, date);
    }


    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public EyeExam getEyeExam() {
        return eyeExam;
    }

    public String getDate() {
        return date;
    }


    public void setPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null for Appointment");
        }
        this.patient = patient;
    }

    public void setDoctor(Doctor doctor) {
        if (doctor == null) {
            throw new IllegalArgumentException("Doctor cannot be null for Appointment");
        }
        this.doctor = doctor;
    }

    public void setEyeExam(EyeExam eyeExam) {
        // eyeExam can be null (optional), but if provided, it must reference this patient
        if (eyeExam != null && !eyeExam.getPatient().getIdNumber().equals(patient.getIdNumber())) {
            throw new IllegalArgumentException("EyeExam patient does not match appointment patient");
        }
        this.eyeExam = eyeExam;
    }

    public void setDate(String date) {
        if (!isValidString(date)) {
            throw new IllegalArgumentException("Date cannot be null or empty");
        }
        this.date = date.trim();
    }


    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appointment on ").append(date).append("\n");
        sb.append("Patient: ").append(patient.getName()).append(" (ID: ").append(patient.getIdNumber()).append(")\n");
        sb.append("Doctor: ").append(doctor.getName()).append("\n");
        if (eyeExam != null) {
            sb.append("Exam Type: ").append(eyeExam.getExamType()).append("\n");
            sb.append("Exam Cost: $").append(eyeExam.getExamCost()).append("\n");
        } else {
            sb.append("Exam: Not assigned\n");
        }
        return sb.toString();
    }


    public double calculateTotalCost() {
        if (eyeExam == null) {
            return 0.0;
        }
        return eyeExam.getExamCost() + eyeExam.calculateTax();
    }


    private boolean isValidString(String s) {
        return s != null && s.trim().length() > 0;
    }
}
