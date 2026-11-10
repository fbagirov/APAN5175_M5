package s5;

public abstract class Shape {
    protected String color;
    private final String name;

    public Shape(String color) {
        this.color = color;
        name = getClass().getSimpleName();
    }

    public abstract double area();

    public void draw() {
        System.out.println("Drawing a shape...");
    }

    @Override
    public String toString() {
        return name + " (color: " + color + ")";
    }
}
