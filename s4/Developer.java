package s4;


public class Developer extends Employee {
    private int overtimeHours;

    public Developer(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        // TODO
    }

    @Override
    public double calculatePay() {
        // TODO base + overtimeHours * rate
        return 0;
    }

    @Override
    public void work() {
        // TODO developer-specific message
    }
}