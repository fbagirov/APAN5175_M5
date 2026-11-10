package s1;

public class Cat extends Animal {
    private boolean indoor;

    public Cat(String name, int age, boolean indoor) {
        super(name, age);
        this.indoor = indoor;
    }

    public boolean isIndoor() {
        return indoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat purrs! ("+name+" is an " + (indoor ? "indoor" : "outdoor") + " cat)");
    }

    @Override
    public String toString() {
        return super.toString() + ", indoor=" + indoor;
    }
}