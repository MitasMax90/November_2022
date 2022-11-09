import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        for (int i = 2; i <= 10; i++) {
//            System.out.print(" i= " + i);
//            for (int j = 2; j < i; j++) {
//                System.out.print(" j= " + j);
//            }
//        }
//        int[] array = {13, 32, 39, 4, 55, 36, 7, 82, 99, 10};
//        int[] copy = array;
//        for (int i = 0; i < copy.length; i++) {
//            copy[i] = copy[i] * 2;
//            System.out.println(copy[i]);
//        }
        int[] array = {22, 4, 5, 6};
        int[] copy = Arrays.copyOf(array, array.length);
        int[] copy1 = Arrays.copyOfRange(array, 1,3);
        int[] fillMassive = new int[10];

        System.out.println("Работа метода copyOf " + Arrays.toString(copy));
        System.out.println("Работа метода copyOfRange " + Arrays.toString(copy1));
//        Arrays.sort(array);
//        System.out.println("Отсортированный массив array: " + Arrays.toString(array));
        System.out.println("Бинарный поиск элемента 4: " + Arrays.binarySearch(array, 4));
        Arrays.fill(fillMassive, 15);
        System.out.println("Заполнение массива элементом 15: " + Arrays.toString(fillMassive));

        int[] array1 = {4, 6, 8, 12};
        int[] array2 = {7, 3, 2, 11};
        System.out.println(Arrays.equals(array1,array2));








    }
}
