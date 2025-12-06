public class Patient {


    private String name;
    private String idNumber;
    private int age;
    private boolean hasMedicalHistory;
    private double lastConsultationCost;


    public Patient(String name, String idNumber, int age, boolean hasMedicalHistory, double lastConsultationCost) {
        setName(name);
        setIdNumber(idNumber);
        setAge(age);
        setHasMedicalHistory(hasMedicalHistory);
        setLastConsultationCost(lastConsultationCost);
    }


    public Patient(String name, String idNumber) {
        this(name, idNumber, 0, false, 0.0);
    }


    public Patient(String name, int age, String idNumber) {
        this(name, idNumber, age, false, 0.0);
    }


    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasMedicalHistory() {
        return hasMedicalHistory;
    }

    public double getLastConsultationCost() {
        return lastConsultationCost;
    }


    public void setName(String name) {
        if (!isValidString(name)) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name.trim();
    }

    public void setIdNumber(String idNumber) {
        if (!isValidString(idNumber)) {
            throw new IllegalArgumentException("ID number cannot be null or empty");
        }
        this.idNumber = idNumber.trim();
    }

    public void setAge(int age) {
        if (!isValidAge(age)) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.age = age;
    }

    public void setHasMedicalHistory(boolean hasMedicalHistory) {
        this.hasMedicalHistory = hasMedicalHistory;
    }

    public void setLastConsultationCost(double lastConsultationCost) {
        if (lastConsultationCost < 0) {
            throw new IllegalArgumentException("Last consultation cost cannot be negative");
        }
        this.lastConsultationCost = lastConsultationCost;
    }

    public void showInfo() {
        System.out.println("=== PATIENT INFORMATION ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + idNumber);
        System.out.println("Age: " + age);
        System.out.println("Medical history: " + (hasMedicalHistory ? "Yes" : "No"));
        System.out.println("Last consultation cost: $" + lastConsultationCost);
    }


    public double calculateDiscount() {
        double rate = 0.0;

        if (hasMedicalHistory) {
            rate += 0.10; // 10%
        }

        if (age >= 60) {
            rate += 0.15; // additional 15%
        }

        return lastConsultationCost * rate;
    }


    private boolean isValidString(String s) {
        return s != null && s.trim().length() > 0;
    }

    private boolean isValidAge(int a) {
        return a >= 0 && a <= 120;
    }
}
