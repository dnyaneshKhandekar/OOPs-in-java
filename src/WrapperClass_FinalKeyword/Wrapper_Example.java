package WrapperClass_FinalKeyword;

public class Wrapper_Example {
    public static void main(String[] args) {
        // this primitive data types declaration and value stored in stack memory.
        int a = 10;
        int b = 20;

        // we can also created primitive data types as object by using primitive data types which is stored in heap memory
        // In wrapper declaration variable treat as refernce variable.
        //  Integer x = new Integer(30);
        Integer x = 30;
        Integer y = 40;

        swap(a, b); // cannot making swapping because wrapper class has final keyword that cannot modified value when it is initialize

        System.out.println(a + " " + b);

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 12;
    String name;

    public A(String name) {
        this.name = name;
    }
}






// learning about "final" keyword
// about Objects
//When you declare an object reference as final, the reference cannot be changed to point to another object, but the internal state (fields) of the object can be modified.
class Car {
    int speed = 50;
}
public class FinalObjectExample {
    public static void main(String[] args) {
        final Car myCar = new Car();
        System.out.println("Initial Speed: " + myCar.speed);

        // Allowed: Modifying object state
        myCar.speed = 80;
        System.out.println("Updated Speed: " + myCar.speed);

        // Not Allowed: Changing reference
        // myCar = new Car(); // ❌ Error: Cannot reassign final reference
    }
}



// about final keyword about classes
//If a class is declared final, it cannot be extended (i.e., no subclasses can be created).
final class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// ❌ Error: Cannot inherit from final class 'Animal'
// class Dog extends Animal { }

public class FinalClassExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}


// "final" keyword about Methods
// Prevent Overriding
// A final method cannot be overridden in a subclass, ensuring its original behavior is preserved.

class Parent {
    final void show() {
        System.out.println("Final method in Parent");
    }
}

class Child extends Parent {
    // ❌ Error: Cannot override final method
    // void show() { System.out.println("Trying to override"); }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
    }
}

//  another example for final method
class Bank {
    final void getInterestRate() {
        System.out.println("Bank interest rate is 5%");
    }
}

class SBI extends Bank {
    // ❌ Error: Cannot override final method from Bank
    // void getInterestRate() {
    //     System.out.println("SBI interest rate is 6%");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.getInterestRate();  // Output: Bank interest rate is 5%

        SBI sbi = new SBI();
        sbi.getInterestRate();  // Output: Bank interest rate is 5% (Inherited, but cannot be overridden)
    }
}


