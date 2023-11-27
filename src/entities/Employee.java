package entities;

public class Employee {

    private String name;
    private  double grossSalary;


    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.grossSalary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
