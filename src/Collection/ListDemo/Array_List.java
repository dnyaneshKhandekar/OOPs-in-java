package Collection.ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List al=new ArrayList();
        al.add(10);
        al.add("nirali");
        al.add(40);

        System.out.println(al);

        System.out.println("------------------------------");

        List<Integer> arr=new ArrayList<>(); //current Capacity->10  //(10-->1.5 )+1
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(10);
        System.out.println(arr);

        System.out.println(arr.get(0));


    }
}
