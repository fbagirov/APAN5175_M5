package s4;

public class Developer extends Employee {
    private double overtimeHours;
    private double overtimeRate;

    public Developer(String name, double baseSalary,
                     double overtimeHours, double overtimeRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (overtimeHours * overtimeRate);
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }
}