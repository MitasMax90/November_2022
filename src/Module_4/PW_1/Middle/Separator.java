package Module_4.PW_1.Middle;
/*
Также реализуйте методы even() и odd(),
они должны возвращать массив четных или нечетных чисел,
отобранных из array.
 */
public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    int[] even() {
        int k = 0, now = 0; // считаем количество элементов
        for (int i : array) {
            if (i % 2 == 0) k++;
        }

        int[] evens = new int[k];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens[now] = array[i]; // заполняем новый массив
                now += 1;
            }
        }
        return evens;
    }

    int[] odd() {
        int k = 0, now = 0; // считаем количество элементов
        for (int i : array) {
            if (i % 2 != 0) k++;
        }

        int[] odds = new int[k];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odds[now] = array[i]; // заполняем новый массив
                now += 1;
            }
        }
        return odds;
    }
}
