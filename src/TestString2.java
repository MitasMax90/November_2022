public class TestString2 {
    public static void main(String[] args) {
        String user1 = "Пётр Петров";
        String user2 = "Алексей Иванов";
        checkUserName(user1, user2);

        String a = "22";
        String b = "22" + a;
        System.out.println(b);

        TestString2 test1 = new TestString2();
//        TestString2 test2 = new TestString2();
        TestString2 test2 = test1;

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    private static void checkUserName(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2)) {
            System.out.println("Выберите другое имя");
        } else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + user2.length() + " символа(ов)!");
            System.out.println("А без пробелов ваше имя занимает " + user2.replace(" ", "").length() + " символов");
        }
    }
}
