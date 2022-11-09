package Module_4;

public class Main {
    public static void main(String[] args) {
        final Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        bigCat.setName("Pushok");
        bigCat.setColor("Black");
        System.out.println(bigCat.getColor());
        System.out.println("The name of big cat is " + bigCat.getName());
        System.out.println("The name of small cat is " + smallCat.getName());

//        bigCat = new Cat(500, "Garfield", 3, "White"); // нельзя
//        bigCat = smallCat; // нельзя


    }
}
