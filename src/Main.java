public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new EmployeeFullTime("Ana", "E001", 2000000, 5);
        employees[1] = new EmployeeContract("Luis", "E002", 1500000, 6);
        employees[2] = new EmployeeFullTime("Maria", "E003", 2500000, 3);

        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println("Salary: $" + emp.calculateSalary());
            System.out.println("---------------------");
        }
    }
}
