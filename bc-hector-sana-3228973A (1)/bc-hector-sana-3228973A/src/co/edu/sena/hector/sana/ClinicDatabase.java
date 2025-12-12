package co.edu.sena.hector.sana;

import java.util.ArrayList;
import java.util.List;

public class ClinicDatabase {
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addAppointment(Appointment a) {
        appointments.add(a);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}
