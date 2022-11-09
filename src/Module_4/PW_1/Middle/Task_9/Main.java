package Module_4.PW_1.Middle.Task_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = a.resize();
        System.out.println(Arrays.toString(arr));

        ToLine b = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr2 = b.resize();
        System.out.println(Arrays.toString(arr2));

    }
}
