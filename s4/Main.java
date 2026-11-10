package s4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Alex", 4000, 10, 30));
        employees.add(new Manager("Sam", 5000, 1000));

        for (Employee employee : employees) {
            System.out.println("Employee: " + employee);
            System.out.printf("Pay: $%.2f%n", employee.calculatePay());
            employee.work();
            System.out.println();
        }
    }
}