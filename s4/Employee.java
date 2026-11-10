package s4;

public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    @Override
    public String toString() {
        return name;
    }
}