package co.edu.sena.hector.sana;

public class EyeExam {
    private OphthalmologyPatient patient;
    private double leftEye;
    private double rightEye;

    public EyeExam(OphthalmologyPatient patient, double leftEye, double rightEye) {
        this.patient = patient;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
    }

    @Override
    public String toString() {
        return "EyeExam{" +
                "patient=" + patient.name +
                ", leftEye=" + leftEye +
                ", rightEye=" + rightEye +
                '}';
    }
}
