package s5;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 3.0);
        Shape s2 = new Rectangle("Blue", 4.0, 2.0);
        Shape[] shapes = {s1, s2};

        for (Shape shape : shapes) {
            System.out.println(shape);
            shape.draw(); // The actual shape determines which draw method runs.
            System.out.printf(Locale.US, "Area: %.2f%n", shape.area());
            System.out.println("----");
        }
    }
}
