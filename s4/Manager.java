package s4;


public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        // TODO
    }

    @Override
    public double calculatePay() {
        // TODO base + bonus
        return 0;
    }

    @Override
    public void work() {
        // TODO manager-specific message
    }
}