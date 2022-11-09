package Module_4;

public class Cat {
    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount;

      // Конструктор по умолчанию
    public Cat() {
        this(3000, "Barsik", 1,  "Grey");
    }

    // Конструктор принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age)
            this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        meow(); meow(); meow();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        weight += 50;
        if (50 / weight > .01)
            pee();
    }
}
