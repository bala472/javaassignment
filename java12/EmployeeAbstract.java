
public abstract class EmployeeAbstract {
    String name;
    String email;
    int id;
    String companyName;
    EmployeeAbstract(String  name,String email,int id){
        this.companyName="Vasanth & Co";
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public abstract double calculatePay();

    public void getEmployeeDetails(){
        System.out.println("Name : "+ this.name);
        System.out.println("ID : "+ this.id);
        System.out.println("Email : "+ this.companyName);
        System.out.println("Salary : "+calculatePay());
    }
}
class HourlyEmployee extends EmployeeAbstract{
    double hour;
    double payPerHour;
    HourlyEmployee(String name ,String email,int id ,double hour,double payPerHour){
        super(name, email, id);
        this.hour=hour;
        this.payPerHour=payPerHour;
    }
    public double calculatePay(){
        return hour*payPerHour;
    }

}
class SalariedEmployee extends EmployeeAbstract{
    double monthlySalary;
    SalariedEmployee(String name ,String email,int id ,double monthlySalary){
        super(name, email, id);
        this.monthlySalary=monthlySalary;
    }
    public double calculatePay(){
        return monthlySalary;
    }
}
class EmployeeDetailsPrint  {
public static void main(String[] args) {
    HourlyEmployee hourlyEmployee = new HourlyEmployee("Kumar", "Kumar@gmail.com", 101, 8, 100);
    SalariedEmployee salariedEmployee = new SalariedEmployee("Deva", "deva@gmail.com", 102, 50000);
    hourlyEmployee.getEmployeeDetails();
    salariedEmployee.getEmployeeDetails();
}  
}
