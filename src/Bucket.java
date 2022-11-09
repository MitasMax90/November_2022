public class Bucket {
    public static void main(String[] args) {
        int a = 30;
        int b = 0;

        while (a > 0) {
            a--;
            if (a % 10 != 0) {
                b++;
            }
            System.out.println(a);
            System.out.println(b);
        }
    }
}
