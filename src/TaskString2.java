import java.util.Locale;
import java.util.Scanner;

/*
Нужно будет проверить, что во введённой строке 3 слова
(если имя, фамилия или отчество пишутся через дефис,
то это считается за одно слово). Если пользователь ввёл имя некорректно,
например, в нём 2 или 4 и более слов,
то нужно вывести сообщение с просьбой ввести имя ещё раз.

Не забудьте удалить лишние пробелы в начале и конце строки.
 */
public class TaskString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("Введите имя!");
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

    private static String formatName(String name) {
        String[] words = name.trim().split(" ");
        sortByLength(words);
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + " ";
            }
        }
        return result;
    }

    private static void sortByLength(String[] words) {

        for (int j = 0; j < words.length - 1; j++) {
            if (words[j].length() > words[j + 1].length()) {
                String tmp = words[j];
                words[j] = words[j + 1];
                words[j + 1] = tmp;
            }
        }
    }
}
