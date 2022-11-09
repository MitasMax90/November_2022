package Module_4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

//        String text = "Максим Митасов";
//        Pattern pattern = Pattern.compile("(.*) (.*)");
//        Matcher matcher = pattern.matcher(text);
//        // меняем местами первую и вторую группу символов
//        System.out.println(matcher.replaceFirst("$2 $1"));

        Pattern pattern = Pattern.compile(":|;");
        String[] animals = pattern.split("cat:dog;bird:cow;orca:bee;horse");
        Arrays.asList(animals).forEach(animal -> System.out.print(animal + " "));


    }


}
