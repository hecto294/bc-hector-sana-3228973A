public class EyeExam {


    private String examDate;   // e.g., "2025-03-10" (string for simplicity)
    private String examType;   // e.g., "Retina Scan"
    private double examCost;
    private boolean completed;
    private Patient patient;


    public EyeExam(String examDate, String examType, double examCost, Patient patient) {
        setExamDate(examDate);
        setExamType(examType);
        setExamCost(examCost);
        setPatient(patient);
        this.completed = false;
    }


    public EyeExam(String examType, Patient patient) {
        this(null, examType, 0.0, patient);
    }


    public String getExamDate() {
        return examDate;
    }

    public String getExamType() {
        return examType;
    }

    public double getExamCost() {
        return examCost;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Patient getPatient() {
        return patient;
    }


    public void setExamDate(String examDate) {
        if (examDate != null && !isValidDateString(examDate)) {
            throw new IllegalArgumentException("Exam date format invalid (expect non-empty string or YYYY-MM-DD)");
        }
        this.examDate = (examDate == null) ? null : examDate.trim();
    }

    public void setExamType(String examType) {
        if (!isValidString(examType)) {
            throw new IllegalArgumentException("Exam type cannot be null or empty");
        }
        this.examType = examType.trim();
    }

    public void setExamCost(double examCost) {
        if (examCost < 0) {
            throw new IllegalArgumentException("Exam cost cannot be negative");
        }
        this.examCost = examCost;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null for an EyeExam");
        }
        this.patient = patient;
    }


    public void markCompleted() {
        setCompleted(true);
    }

    public void showExamInfo() {
        System.out.println("\n=== EYE EXAM INFORMATION ===");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Date: " + (examDate == null ? "Not scheduled" : examDate));
        System.out.println("Exam Type: " + examType);
        System.out.println("Cost: $" + examCost);
        System.out.println("Completed: " + (completed ? "Yes" : "No"));
    }


    public double calculateTax() {
        return examCost * 0.19;
    }


    private boolean isValidString(String s) {
        return s != null && s.trim().length() > 0;
    }


    private boolean isValidDateString(String d) {
        return d != null && d.trim().length() >= 4;
    }
}
