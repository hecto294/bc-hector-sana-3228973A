public class EmployeeFullTime extends Employee {
    private int yearsExperience;

    public EmployeeFullTime(String name, String id, double baseSalary, int yearsExperience) {
        super(name, id, baseSalary);
        this.yearsExperience = yearsExperience;
    }

    @Override
    public double calculateSalary() {
        double bonus = baseSalary * 0.05 * yearsExperience;
        return baseSalary + bonus;
    }
}
