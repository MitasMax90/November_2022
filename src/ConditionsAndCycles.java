public class ConditionsAndCycles {

    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
        b = b + c; // b = 5
//    a = a * b; // a = 20
        c = a - c; // c = 2
        a = a + b; // a = 9
        a = a - b; // a = 4
        c = a + b; // c = 9
//    b = c / a; // b = 7
//    a = b + c; // a = 45
        a = a + c + b; // a = 18

        for (int i = 0; i < 20; i++) {
            System.out.print(" " + a);
        }

        // Напишите здесь свой код
    }
}
