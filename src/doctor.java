public class doctor {
    private String name;
    private String specialty;
    private String licenseNumber;

    public doctor(String name, String specialty, String licenseNumber) {
        this.name = name;
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    
    public String getDoctorInfo() {
        return "Dr. " + name + " - Especialidad: " + specialty;
    }
}
