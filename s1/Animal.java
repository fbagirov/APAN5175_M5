package s1;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        // Parameter initialization
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        // (default animal sound)
        System.out.println("Some generic animal sound");
    }

    public void eat() {
        // TODO (print something generic)
        System.out.println(name + " is eating.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        // TODO
        return getClass().getSimpleName() + " {name=" + name + ", age=" + age + "}";
    }
}