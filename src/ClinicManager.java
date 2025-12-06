import java.util.ArrayList;
import java.util.Iterator;

public class ClinicManager {

   
    private String clinicName;
    private ArrayList<Appointment> appointments;


    public ClinicManager(String clinicName) {
        setClinicName(clinicName);
        this.appointments = new ArrayList<>();
    }


    public String getClinicName() {
        return clinicName;
    }

    public ArrayList<Appointment> getAppointments() {
        return new ArrayList<>(appointments); // defensive copy
    }


    public void setClinicName(String clinicName) {
        if (!isValidString(clinicName)) {
            throw new IllegalArgumentException("Clinic name cannot be null or empty");
        }
        this.clinicName = clinicName.trim();
    }


    public void addAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null");
        }
        appointments.add(appointment);
    }

    public boolean removeAppointmentByDate(String date) {
        if (!isValidString(date)) {
            return false;
        }
        Iterator<Appointment> it = appointments.iterator();
        while (it.hasNext()) {
            Appointment a = it.next();
            if (date.equals(a.getDate())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public int countAppointments() {
        return appointments.size();
    }

    public void showAllAppointments() {
        System.out.println("=== Appointments for clinic: " + clinicName + " ===");
        if (appointments.isEmpty()) {
            System.out.println("No appointments registered.");
            return;
        }
        for (Appointment app : appointments) {
            System.out.println("----------------------------");
            System.out.println(app.getSummary());
        }
    }

    public ArrayList<Appointment> findAppointmentsByPatientId(String idNumber) {
        ArrayList<Appointment> found = new ArrayList<>();
        if (!isValidString(idNumber)) {
            return found;
        }
        for (Appointment a : appointments) {
            if (a.getPatient().getIdNumber().equals(idNumber)) {
                found.add(a);
            }
        }
        return found;
    }


    private boolean isValidString(String s) {
        return s != null && s.trim().length() > 0;
    }
}
