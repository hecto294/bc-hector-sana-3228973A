public class EmployeeContract extends Employee {
    private int contractMonths;

    public EmployeeContract(String name, String id, double baseSalary, int contractMonths) {
        super(name, id, baseSalary);
        this.contractMonths = contractMonths;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
