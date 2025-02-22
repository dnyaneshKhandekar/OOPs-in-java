package Super_This_keyword.super_keyword;

class Child extends Parent {

////  --------------- Using super() to Call Parent Constructor----------------------
//    Child() {
//        super(); // Calls Parent() constructor
//        System.out.println("Child class constructor");
//    }
//
//    public static void main(String[] args) {
//        Child obj = new Child();
//    }


//   --------------------  Using super(param) to Call Parameterized Constructor------------------
//    Child() {
//        super("Hello from Child"); // Calls Parent(String msg) constructor
//        System.out.println("Child class constructor");
//    }
//
//    public static void main(String[] args) {
//        Child obj = new Child();
//    }


    void display() {
        super.display(); // Calls Parent's display() method
        System.out.println("Child class method");
    }

    int num = 200;

    void show() {
        System.out.println("Child num: " + num);       // Refers to Child class variable
        System.out.println("Parent num: " + super.num); // Refers to Parent class variable
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        Child obj2 = new Child();
        obj2.show();

    }

}
