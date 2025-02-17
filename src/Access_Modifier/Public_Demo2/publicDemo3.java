package Access_Modifier.Public_Demo2;

import Access_Modifier.Public_Demo.PublicDemo;

public class publicDemo3 {
    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();
        System.out.println(obj.name);
        obj.name = "Omkar";
        System.out.println(obj.name);
    }
}
