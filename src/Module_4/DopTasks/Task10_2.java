package Module_4.DopTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10_2 {
    public static void main(String[] args) {
        String text = "Рекс Лорд Лом Шарик Бобик Шалун";
        Pattern pattern = Pattern.compile("\\b[Л][а-я]+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }


    }
}
