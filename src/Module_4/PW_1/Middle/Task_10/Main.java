package Module_4.PW_1.Middle.Task_10;

public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("John",12,5,"fire");
        Mage mage2 = new Mage("Bred",12,5,"ice");
        Mage mage3 = new Mage("Frank",11,5,"earth");

        Mage mage4 = new Mage("Fill",11,5,"fire");
        Mage mage5 = new Mage("Mons",11,5,"ice");
        Mage mage6 = new Mage("Gleb",11,5,"earth");

        System.out.println(mage1.getInfo());
        System.out.println(mage2.getInfo());
        System.out.println(mage3.getInfo());

        System.out.println();

        System.out.println(mage3.fight(mage2));
    }
}
