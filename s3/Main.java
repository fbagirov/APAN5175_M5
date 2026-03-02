package s3;


public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Car("Toyota", 4),
                new Motorcycle("Honda", false)
        };

        for (Vehicle v : vehicles) {
            System.out.println(v);
            v.startEngine();
            v.accelerate(10);
            v.honk(); // dynamic binding
            System.out.println("----");
        }
    }
}