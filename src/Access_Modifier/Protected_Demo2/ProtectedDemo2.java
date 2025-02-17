package Access_Modifier.Protected_Demo2;

import Access_Modifier.Protected_Demo.ProtectedDemo;

public class ProtectedDemo2 extends ProtectedDemo {
    public static void main(String[] args) {
        ProtectedDemo2 obj = new ProtectedDemo2();  // ✅ Use subclass object not parent class object
        System.out.println(obj.message);  // ✅ Now it works because it's inherited
    }



    //below code give error because we are tying to access protected variable without using inheritance in another package
//    public static void main(String[] args) {
//        ProtectedDemo obj = new ProtectedDemo();
//
//
//        obj.message = "hiii omkar, i am protected";
//        System.out.println(obj.message);
//
//    }

}
