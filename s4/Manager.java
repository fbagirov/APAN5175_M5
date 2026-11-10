package s4;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }
}