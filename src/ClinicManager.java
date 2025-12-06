import java.util.ArrayList;

public class ClinicManager {
    private String clinicName;
    private ArrayList<Appointment> appointments;

    public ClinicManager(String clinicName) {
        this.clinicName = clinicName;
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public int countAppointments() {
        return appointments.size();
    }

    public void showAllAppointments() {
        for (Appointment app : appointments) {
            System.out.println("----------------------------");
            System.out.println(app.getSummary());
        }
    }
}
