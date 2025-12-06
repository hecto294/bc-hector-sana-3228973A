public class Appointment {

    private String date;




    public String getDate() {
        return this.date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public void createAppointment(String patientName) {
        System.out.println("Appointment created for: " + patientName);
        this.date = "No Date Specified";
    }


    public void createAppointment(String patientName, String date) {

        this.date = date;
        System.out.println("Appointment created for: " + patientName +
                " on " + date);
    }


    public void createAppointment(String patientName, String date, String doctor) {
        // Almacena la fecha en el campo 'date' de la clase
        this.date = date;
        System.out.println("Appointment created for: " + patientName +
                " on " + date + " with Dr. " + doctor);
    }

}

