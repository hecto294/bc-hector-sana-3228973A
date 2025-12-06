public class Employee {
    protected String name;
    protected String id;
    protected double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public void showInfo() {
        System.out.println("Employee: " + name);
        System.out.println("ID: " + id);
    }

    public double calculateSalary() {
        return baseSalary;
    }
}
