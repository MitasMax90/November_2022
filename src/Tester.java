import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[] news = new int[11];
        int value = 5;

        for (int i = 0; i < news.length; i++) {
            news[i] = value;
            value++;
        }
        System.out.println(Arrays.toString(news));
    }
}
