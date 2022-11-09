package Module_4.DopTasks;

public class Workbench {
    private int oil;
    private final String name;
    private boolean isOff;

    public Workbench(int oil, String name) {
        this.oil = oil;
        this.name = name;
    }

    void start() {
        this.isOff = false;
    }

    void partsProduction(int amount) {
        if (oil > amount) {
            oil -= amount;
            System.out.println(name + " Work is done!");
        } else if (oil < amount){
            System.out.println(name + " Get oil, plise!");
            isOff = true;
        }
    }

    void refuel(int refOil) {
        oil += refOil;
        System.out.println(name + " : is ready to work!");
        isOff = false;
    }

    public static void main(String[] args) {
        Workbench workbench = new Workbench(100, "Stanok-01");
        workbench.start();
        workbench.partsProduction(50);
        workbench.partsProduction(100);
        workbench.refuel(50);
        workbench.partsProduction(100);

    }
}
