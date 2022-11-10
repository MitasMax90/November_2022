package Module_4.PW_1.Middle.Task_9;

public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize() {
        // Склеиваем двумерный массив в одномерный при помощи переменной типа int start
        int[] result = new int[data.length * data[0].length];
        int start = 0;
        for (int[] buff : data) {
            for (int j = 0; j < buff.length; j++) {
                result[start + j] = buff[j];
            }
            start += buff.length;
        }
        return result;
    }
}
