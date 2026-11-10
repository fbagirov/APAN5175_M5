package s1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Animal objects
        Animal a = new Dog("Rex", 5, "Labrador");
        a.makeSound();

        System.out.print("------\n");

        ArrayList<Animal> animals = new ArrayList<>();
        

        // Add some Cat and Dog objects to the list
        animals.add(new Cat("Whiskers", 3, true));
        animals.add(new Dog("Buddy", 5, "Golden Retriever"));
        animals.add(new Cat("Mittens", 2, false));
        animals.add(new Dog("Max", 4, "Beagle"));

        // Iterate through the list and call makeSound() and eat() for each animal
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.makeSound();
            animal.eat();
            System.out.println(); // Print a blank line for better readability
        }
    }
}