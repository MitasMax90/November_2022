public class TestString3 {
    public static void main(String[] args) {
//        String name = "Василь";
//        int age = 45;
//        String work = "военнслужащий";
//        System.out.printf("Всем привет, этого ебалая зовут %s, ему %d лет и он чалится, мается, он %s!!!", name, age,work);
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
        return str.replaceAll(" ", "");
    }
}

