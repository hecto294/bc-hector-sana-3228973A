public class Patient {
    private String name;
    private String idNumber;
    private int age;
    private boolean hasMedicalHistory;
    private double lastConsultationCost;



    public Patient(String name, String idNumber, int age, boolean hasMedicalHistory, double lastConsultationCost) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
        this.hasMedicalHistory = hasMedicalHistory;
        this.lastConsultationCost = lastConsultationCost;
    }

    public void showInfo() {
        System.out.println("=== PATIENT INFORMATION ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + idNumber);
        System.out.println("Age: " + age);
        System.out.println("Medical History: " + (hasMedicalHistory ? "Yes" : "No"));
        System.out.println("Last Consultation Cost: $" + lastConsultationCost);
    }
    public double calculateDiscount() {
        double discount = 0;

        if (hasMedicalHistory) {
            discount += 0.10; // 10%
        }

        if (age >= 60) {
            discount += 0.15; // 15%
        }

        return lastConsultationCost * discount;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setLastConsultationCost(double newCost) {
        this.lastConsultationCost = newCost;
    }
}

