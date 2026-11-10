package s1;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name; // TODO
        this.age = age; // TODO
    }

    public void makeSound() {
        System.out.println("Some animal sound"); // TODO (default animal sound)
    }

    public void eat() {
        System.out.println(name + " is eating."); // TODO (print something generic)
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Age: " + age; // TODO
    }
}