import java.util.Locale;

public class TestString {
    public static void main(String[] args) {



        String b = "Велосипедист";
        System.out.println(b.length());
        System.out.println(b.charAt(4));
        System.out.println("Привет".concat(" мир!"));

        System.out.println("Some stringo".lastIndexOf('o'));
        System.out.println(" Лишние пробелы  ".trim());
        System.out.println("      Мама мыла раму".toUpperCase(Locale.ROOT).trim());
        System.out.println("Привет мой родной человек".substring(6, 11));

        System.out.println();

        String s = "Привет,мой,родной,человек";
        String[] a = s.split(",");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();

        System.out.println("abra cadabra".replace('a', 'e'));
        System.out.println("abra cadabra".replaceAll("abra", "no"));
        System.out.println("abra cadabra".replaceFirst("abra", "new"));

        System.out.println("sometimes".charAt(2));


        String c = "22";
        String d = "22";
        System.out.println(c.equals(d));

        System.out.println();

        String name3 = "Иван Иванов";
        String name4 = "иван иванов";
        System.out.println(name3.equals(name4));


        String name1 = "Пётр Сидоров";
        String name2 = "иван иванов";

        if (name1.equalsIgnoreCase(name2))
            System.out.println("Выберите другое имя");
        else
            System.out.println("Отличное имя!");



    }


}
