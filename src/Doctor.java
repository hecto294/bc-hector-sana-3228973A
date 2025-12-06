public class Doctor {
    protected String name;
    protected String specialty;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getDoctorInfo() {
        return "Doctor: " + name + " | Specialty: " + specialty;
    }
}
