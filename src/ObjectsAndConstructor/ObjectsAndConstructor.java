public class ObjectsAndConstructor {
    public static void main(String[] args) {

        // ----------------------------- Objects and Classes ---------------------------------------

        //  refrence variable declaration and initialaztion seprately
//        Student student1;   // compile time
//        student1 = new Student();  // runtime
//
//        Student student2 = new Student();
//        System.out.println(student2.name[0]);
//
//        Car car1 = new Car();
//        car1.company = "TATA";
//        car1.engine = "v12";
//        car1.model = 13242;
//        car1.price = 8000000.00f;

//        System.out.println(car1.company+" "+ car1.engine+" "+ car1.model+" "+ car1.price);


        // --------------------------  CONSTRUCTOR ---------------------------------------------------

        // A constructor in Java is a special method used to initialize objects.
        // It is called automatically when an object is created.
        // Constructors set up the initial state of an object by assigning values to its fields or performing other setup tasks

        Car car1 = new Car();
        System.out.println(car1.company + " " + car1.engine + " " + car1.model + " " + car1.price + " " + car1.name);

        Car car2 = new Car("V8",74573, "Mahindra", 5000000.40f, "XUV700");
        System.out.println(car2.company + " " + car2.engine + " " + car2.model + " " + car2.price + " " + car2.name);



    }
}
class Student {
    int[] rollNo = {1,2,3,4,};
    String[] name = {"Dnyanesh", "Omkar", "Pratik", "sahil"};
    float[] id = {1.4f, 3.2f, 5.3f, 3.23f};
}

class Car {
    String engine;
    int model;
    String company;
    float price;
    String name;

    Car() {
        this.engine = "Default Engine";
        this.model = 0;
        this.company = "Default Company";
        this.price = 0.0f;
        this.name = "Default Name";
    }

    Car(String engine, int model, String company, float price, String name) {
        this.engine = engine;
        this.model = model;
        this.company = company;
        this.name = name;
        this.price = price;
    }
}
