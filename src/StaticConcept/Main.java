package StaticConcept;

public class Main {
    public static void main(String[] args) {
        Human dk = new Human(19, "Dnyanesh Khandekar", "brown", 5.34f, false);
        Human ol = new Human(20, "Omkar Lande", "brown", 5.00f, false);
        Human pk = new Human();

        System.out.println(dk.age);
        System.out.println(dk.population);
//        System.out.println(ol.population);
        System.out.println(pk.population);


    }
}
