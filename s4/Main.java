package s4;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Alice", 1200, 5));
        employees.add(new Manager("Bob", 1500, 300));

        for (Employee e : employees) {
            System.out.println(e);
            System.out.println("Pay: " + e.calculatePay()); // dynamic binding
            e.work();
            System.out.println("----");
        }
    }
}