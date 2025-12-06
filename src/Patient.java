public class Patient {
    protected String name;
    protected int age;
    protected String id;

    public Patient(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Polymorphic method
    public String getPatientInfo() {
        return "Patient: " + name + ", Age: " + age + ", ID: " + id;
    }
}
