package Module_4.NewString;

public class Test {
    static String multString(String p, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += p;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(multString("A", 1000000));

//        StringBuilder stringBuilder = new StringBuilder("Митасов Максим Александрович");
//        System.out.println("Длина изначального выражения: " + stringBuilder.length());
//        stringBuilder.append(" - классный чувак!");
//        System.out.println(stringBuilder);
//        stringBuilder.delete(39,42);
//        System.out.println(stringBuilder);
//        stringBuilder.insert(32, "овсяк");
////        System.out.println(stringBuilder);
//        System.out.println(stringBuilder.toString());

    }
}
