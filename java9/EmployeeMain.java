class Employee {
    private String name;
    private int employeeId;
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public String getEmployeeDetails() {
        return "Name: " + name + " Employee ID: " + employeeId;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    public HourlyEmployee(String name, int employeeId, double hourlyRate) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
    }
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + "Hourly wage for employee Rs. " + hourlyRate;
    }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;
    public SalariedEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + "Monthly salary is Rs." + monthlySalary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("Bala", 101, 1000);
        Employee emp2 = new SalariedEmployee("Dinesh", 102,60000 );

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            System.out.println(emp.getEmployeeDetails());
        }
    }
}
