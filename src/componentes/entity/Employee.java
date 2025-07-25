package componentes.entity;

public class Employee {

    private String name;
    private double GrossSalary;

    public Employee() {
    }

    public Employee(String name, double grossSalary) {
        this.name = name;
        GrossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return GrossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        GrossSalary = grossSalary;
    }
}
