package co.edu.sena.hector.sana;

public class Appointment {
    private String appointmentId;
    private Patient patient;
    private String date;

    public Appointment(String appointmentId, Patient patient, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", patient=" + patient.name +
                ", date='" + date + '\'' +
                '}';
    }
}
