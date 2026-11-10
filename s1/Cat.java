package s1;

public class Cat extends Animal {
    private boolean indoor;

    public Cat(String name, int age, boolean indoor) {
        super(name, age);
        this.indoor = indoor; // TODO
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!"); // TODO (print cat meow)
    }
}