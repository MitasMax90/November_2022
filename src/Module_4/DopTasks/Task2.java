package Module_4.DopTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String stringTest = "\\b[Сс][а-я]+\\b";
        String text = "У Сени и Сани в сенях сом с усами";
        Pattern pattern = Pattern.compile(stringTest);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }
}
