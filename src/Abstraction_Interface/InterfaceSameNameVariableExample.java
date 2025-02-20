package Abstraction_Interface;


// First Interface
interface InterfaceA {
    int VALUE = 10; // public, static, final by default
}

// Second Interface
interface InterfaceB {
    int VALUE = 20; // Same variable name as in InterfaceA
}

// Implementing both interfaces
class MyClass implements InterfaceA, InterfaceB {
    void showValues() {
        // Accessing variables using interface name
        System.out.println("InterfaceA VALUE: " + InterfaceA.VALUE); // 10
        System.out.println("InterfaceB VALUE: " + InterfaceB.VALUE); // 20
    }
}


public class InterfaceSameNameVariableExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showValues();
    }
}
