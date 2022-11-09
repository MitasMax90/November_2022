package Module_4.PW_1.Simple;

public class Human {
    String name, adress, work;
    int age, weight;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 70;
    }

    public Human(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.weight = 60;
        this.age = 33;
    }

    public Human(String name, int age, int weight) {
        this(name, age);
        this.weight = weight;
    }

    public Human(String name, String work, int age) {
        this.name = name;
        this.work = work;
        this.age = age;
        this.weight = 75;
    }

    public Human(int age, String adress, String work, int weight) {
        this.name = "Jonathan";
        this.adress = adress;
        this.work = work;
        this.weight = weight;
        this.age = age;
    }
}
