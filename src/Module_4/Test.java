package Module_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            sb.reverse();
//        }
//        System.out.println((System.currentTimeMillis() - startTime));

        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile("\bs[a-z]*?s\b");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher);


    }
}
