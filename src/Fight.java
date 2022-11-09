public class Fight {
    public static void main(String[] args) {
        Ork ork = new Ork();
        Elf elf = new Elf();
        battle(ork, elf);


    }

    public static void battle(Ork ork, Elf elf) {
        while (true) {
            if (!ork.isOrcAlive && elf.isElfAlive) {
                System.out.println("Ork is dead. Elf win!");
                break;
            } else if (ork.isOrcAlive && !elf.isElfAlive) {
                System.out.println("Elf is dead. Orc win!");
                break;
            } else if (!ork.isOrcAlive && !elf.isElfAlive) {
                System.out.println("All is dead!");
                break;
            }

            if (elf.health < 0) {
                elf.isElfAlive = false;
            } else {
                elf.health -= ork.strength;
            }

            if (ork.health < 0) {
                ork.isOrcAlive = false;
            } else {
                ork.health -= elf.strength;
            }
        }
    }
}

class Elf {
    int health = 100;
    int strength = 10;
    boolean isElfAlive = true;
}

class Ork {
    int health = 100;
    int strength = 20;
    boolean isOrcAlive = true;
}

