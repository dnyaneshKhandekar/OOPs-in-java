package Abstraction_Interface;

// First Interface
interface Animal {
    void makeSound();
}

// Second Interface
interface Pet {
    void play();
}

// A class implementing multiple interfaces
class Dog implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Dog barks...");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing...");
    }
}

// Main Class
public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks...
        myDog.play();      // Output: Dog is playing...
    }
}
