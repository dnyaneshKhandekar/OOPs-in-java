package Super_This_keyword.super_keyword;

public class Parent {
    int num = 100;

    Parent() {
        System.out.println("Parent class constructor");
    }

    Parent(String msg) {
        System.out.println("Parent says: " + msg);
    }

    void display() {
        System.out.println("Parent class method");
    }
}
