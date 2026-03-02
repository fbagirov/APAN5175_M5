package s5;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle("Red", 3.0),
                new Rectangle("Blue", 4.0, 2.0)
        };

        for (Shape s : shapes) {
            s.draw(); // dynamic binding
            System.out.println("Area: " + s.area());
            System.out.println("----");
        }
    }
}