public class Loader {
    public static void main(String[] args) {
        int a = 10;

        while (a > 0) {
            a -= 1;
            if (a == 5) break;
        }

        int summ = 0;
        for (int i = 0; i < 50; i++) {
            if (i == 45) continue;
            summ += i;
        }
        switch (summ) {
            case 50:
                System.out.println(summ);
                break;
            case 1180:
                System.out.println(summ);
                break;
            case 1225:
                System.out.println(summ);
                break;
            default:
                System.out.println("Результат неверный");
        }
        if (a == 5 && summ == 1180) System.out.println("Условие выполнено");
            else System.out.println("Условие не выполнено");


    }
}
