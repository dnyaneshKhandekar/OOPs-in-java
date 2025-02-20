package Abstraction_Interface;

// Defining an Interface
interface Animal {
    void makeSound(); // Abstract method (no implementation)
    void sleep();     // Abstract method
}

// Implementing the Interface in a Class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}

// Main Class
public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Interface reference
        myDog.makeSound(); // Output: Dog barks...
        myDog.sleep();     // Output: Dog is sleeping...
    }
}

