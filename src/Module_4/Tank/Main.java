package Module_4.Tank;

public class Main {
    public static void main(String[] args) {
//        Tank justTank = new Tank();
//// At (10;10) fuel=100
//        Tank anywareTank = new Tank(10, 10);
//// At (20;30) fuel=200
//        Tank customTank = new Tank(20, 30, 200);
//        justTank.goForward(200);
//        justTank.printPosition();
//        anywareTank.goBackward(-200);
//        anywareTank.printPosition();
//        customTank.goForward(201);
//        customTank.printPosition();

        Plane plane = new Plane();

        plane.flyStraight(50);
        plane.flyUp(80,90);
        plane.turnRight();
        plane.flyStraight(30);
        plane.dropBombs();
        plane.flyStraight(40);
        plane.flyDown(100,10);
        plane.fillFuel();
        plane.flyDown(100,10);
        plane.fillFuel();
    }
}