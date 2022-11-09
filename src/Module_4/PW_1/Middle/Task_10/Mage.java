package Module_4.PW_1.Middle.Task_10;

public class Mage {
    private String name;
    private int level;
    private int damage;
    private String typeOfMage;

    public Mage(String name, int level, int damage, String typeOfMage) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.typeOfMage = typeOfMage;
    }

    public String getInfo() {
        return name + ", " + level + ", " + damage + ", " + typeOfMage;
    }

    public String fight(Mage mage) {
        if (this.typeOfMage.equals("fire") && mage.typeOfMage.equals("ice")) return this.name;
        else if (this.typeOfMage.equals("ice") && mage.typeOfMage.equals("earth")) return this.name;
        else if (this.typeOfMage.equals("earth") && mage.typeOfMage.equals("fire")) return this.name;
        else if (!this.typeOfMage.equals(mage.typeOfMage)) return mage.name;
        else {
            if (this.level > mage.level) return this.name;
            else if (this.level < mage.level) return mage.name;
            else {
                if (this.damage > mage.damage) return this.name;
                else if (this.damage < mage.damage) return mage.name;
                else return "draw";
            }
        }
    }
}
