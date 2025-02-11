package StaticConcept;

public class Human {
    int age;
    String name;
    String skin;
    float height;
    boolean married;
    static long population;

    public Human() {
        this.age = 21;
        this.name = "Pratik Khodka";
        this.skin = "white";
        this.height = 4.89f;
        this.married = false;
    }

    public Human(int age, String name, String skin, float height, boolean married) {
        this.age = age;
        this.name = name;
        this.skin = skin;
        this.height = height;
        this.married = married;

        Human.population += 1;

    }
}
