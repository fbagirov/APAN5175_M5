package s4;


public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        // TODO
    }

    public abstract double calculatePay();

    public void work() {
        // TODO generic work message
    }

    @Override
    public String toString() {
        // TODO
        return "TODO";
    }
}