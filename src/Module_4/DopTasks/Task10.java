package Module_4.DopTasks;


import java.util.regex.Pattern;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        String text = "Рекс Лорд Лом Шарик Бобик Шалун";
        String[] name = text.split(" ");

        for (String s : name) {
            if (Pattern.matches("Л[а-я]+", s)) {
                System.out.print(s + " ");
            }

        }
    }
}
