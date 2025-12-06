public class Doctor {

    private String name;
    private String specialty;
    private String licenseNumber;


    public Doctor(String name, String specialty, String licenseNumber) {
        setName(name);
        setSpecialty(specialty);
        setLicenseNumber(licenseNumber);
    }

    public Doctor(String name, String specialty) {
        this(name, specialty, "UNKNOWN");
    }


    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }


    public void setName(String name) {
        if (!isValidString(name)) {
            throw new IllegalArgumentException("Doctor name cannot be null or empty");
        }
        this.name = name.trim();
    }

    public void setSpecialty(String specialty) {
        if (!isValidString(specialty)) {
            throw new IllegalArgumentException("Specialty cannot be null or empty");
        }
        this.specialty = specialty.trim();
    }

    public void setLicenseNumber(String licenseNumber) {
        if (!isValidString(licenseNumber)) {
            throw new IllegalArgumentException("License number cannot be null or empty");
        }
        this.licenseNumber = licenseNumber.trim();
    }


    public String getDoctorInfo() {
        return "Dr. " + name + " - Specialty: " + specialty + " (License: " + licenseNumber + ")";
    }


    private boolean isValidString(String s) {
        return s != null && s.trim().length() > 0;
    }
}
