package Wrapper_Class;

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
