package Module_4.Tank;

public class Plane {
    private int x, y, z;
    private int countBombs;
    private int fuel;
    private int dir = 0;

    public Plane() {
        this.x = 100;
        this.y = 100;
        this.z = 100;
        this.fuel = 100;
        this.countBombs = 5;
    }

    public Plane(int x, int y, int z, int countBomb, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.countBombs = countBomb;
        this.fuel = fuel;

    }

    public void flyStraight(int i) {
        switch (dir) {
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("Что-то пошло не так");
                break;
        }
        this.fuel--;
        if(this.fuel <= 0 && this.z > 0) {
            System.out.println("Кончилось топливо(game over)");
        } else {
            System.out.println("Вы пролетели прямо и сейчас находитесь на координатах: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". Топлива осталось= " + this.fuel);
        }
    }

    public void flyStraightNonForPlayer(int i) {
        switch (dir) {
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("Что-то пошло не так");
                break;
        }
        fuel--;
    }

    public void flyUp(int up, int i) {
        flyStraightNonForPlayer(i);
        this.z += up;
        if (this.fuel <= 0 && z > 0) {
            System.out.println("Кончилось топливо(game over)");
        } else {
            System.out.println("Вы поднялись ввысь и сейчас находитесь на координатах: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". Топлива осталось= " + this.fuel);
        }

    }

    public void flyDown(int down, int i) {
        flyStraightNonForPlayer(i);
        this.z -= down;
        if (this.fuel <= 0 && z > 0) {
            System.out.println("Самолет приземлился)))");
        } else {
            System.out.println("Вы опустились ниже и сейчас находитесь на координатах: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". Топлива осталось= " + this.fuel );
        }
    }

    public void fillFuel() {
        if (this.z > 0) {
            System.out.println("Нельзя заправляться в воздухе");
        } else {
            this.fuel += 100;
            if (this.fuel > 100) {
                this.fuel = 100;
            }
            System.out.println("Вы заправились. Сейчас топлива= " + this.fuel);
        }
    }

    public void dropBombs() {
        if (countBombs > 0) {
            countBombs--;
            System.out.println("Самолет сбросил бомбы по координатам x= " + this.x + ", y = " + this.y + " Кол-во бомб= " + this.countBombs);
        } else {
            System.out.println("Нет бомб");
        }

    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
        System.out.println("Вы повернули налево");
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
        System.out.println("Вы повернули направо");
    }

}
