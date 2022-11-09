package Module_4.PW_1.Middle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Programmer programmer = new Programmer("John", "USA");
//        System.out.println(programmer.getPosition());
//        programmer.work();
//        System.out.println(programmer.getPosition());

//        LimitRectangle r = new LimitRectangle(new int[][] {{1, 0}, {2, 3}});
//        System.out.println(r.getWidth() + " " + r.getHeight());
//        System.out.println(r.getBorders());

        int[] arcos = {1, 3, 5, 7, 8, 10, 12, 14, 17, 18, 19};
        Separator sep = new Separator(arcos);
        Separator sep1 = new Separator(arcos);

        System.out.println("Новый массив из чётных элементов: " + Arrays.toString(sep.even()));
        System.out.println("Новый массив из нечётных элементов: " + Arrays.toString(sep1.odd()));


    }
}
