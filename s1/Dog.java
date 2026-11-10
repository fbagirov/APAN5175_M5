package s1;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed
    }

    public String getBreed() {
        return breed;
    }

    @Override 
    public void makeSound() {
        System.out.println("Dog barks! ("+name+" is a "+breed+")");
    }


    @Override
    public String toString() {
        // 
        return super.toString() + ", breed=" + breed + "'";
    }
}