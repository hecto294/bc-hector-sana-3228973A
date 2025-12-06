public class EyeExam {

    private String examDate;
    private String examType; // Example: "Retina Scan", "Vision Test", "Topography"
    private double examCost;
    private boolean completed;
    private Patient patient;

    public EyeExam(String examDate, String examType, double examCost, Patient patient) {
        this.examDate = examDate;
        this.examType = examType;
        this.examCost = examCost;
        this.completed = false;
        this.patient = patient;
    }

    public void markCompleted() {
        completed = true;
    }
    public void showExamInfo() {
        System.out.println("\n=== EYE EXAM INFORMATION ===");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Date: " + examDate);
        System.out.println("Exam Type: " + examType);
        System.out.println("Cost: $" + examCost);
        System.out.println("Completed: " + (completed ? "Yes" : "No"));
    }

    public double calculateTax() {
        return examCost * 0.19;
    }

    public String getExamType() {
        return null;
    }
}
