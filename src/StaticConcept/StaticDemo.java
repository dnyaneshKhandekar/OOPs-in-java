package StaticConcept;

public class StaticDemo {
    static String name = "divya"; // static variable

    public static void main(String[] args) {
        System.out.println(StaticDemo.name);

        StaticDemo.name = "raj";
        System.out.println(StaticDemo.name);
        System.out.println("--------------------------------");

        System.out.println(StaticDemo.name);
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        Counter obj1 = new Counter();
        obj1.displayCount(); // Count: 1

        Counter obj2 = new Counter();
        obj2.displayCount(); // Count: 2

        Counter obj3 = new Counter();
        obj3.displayCount(); // Count: 3
    }
}


class Counter {
    static int count = 0; // Static variable

    Counter() {
        count++; // Increment count whenever an object is created
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

//public class StaticDemo {
//    static String name = "divya"; // static variable
//
//    public static void main(String[] args) {
//        StaticDemo obj1 = new StaticDemo();
//        System.out.println(obj1.name);
//
//        obj1.name = "raj";
//        System.out.println(obj1.name);
//        System.out.println("--------------------------------");
//
//        StaticDemo obj2 = new StaticDemo();
//        System.out.println(obj2.name);
//    }
//}
