package Module_4.PW_1.Middle.Task_9;

public class ToTable {
    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        // Склеиваем одномерный массив в двумерный при помощ start
        int[][] result = new int[x][y];
        int start = 0;
        for (int i = 0; i < x; i++) {
            for (int j = start; j < start + y; j++) {
                result[i][j - start] = data[j];
            }
            start += y;
        }
        return result;
    }
}
