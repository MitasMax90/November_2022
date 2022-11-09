package Cycle;

public class Task3 {
    public static void main(String[] args) {

        int i, j;
        String[] result = new String[5];
        int[][] points = {
                {4, 3, 3, 5, 4},
                {5, 3, 4, 5, 3},
                {4, 5, 3, 5, 4},
                {4, 5, 3, 5, 3},
                {4, 3, 3, 3, 4},
        };

        int[] sumPoints = new int[5];
        String[] name = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        for (i = 0; i < name.length; i++) {
            for (j = 0; j < points[i].length; j++) {
                sumPoints[i] += points[i][j];
            }
            result[i] = name[i] + " " + sumPoints[i];
            System.out.println(result[i]);
        }
    }
}
