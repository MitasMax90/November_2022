package Module_4.DopTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {

        String textForCheck = "WrongMsisdnError SuccessfulTransaction TimeOutError InternalError SuccessfulTransaction ExternalIDError SuccessfulTransaction WrongIDError InvalidArgumentError SuccessfulTransaction SuccessfulTransaction SuccessfulTransaction WrongMsisdnError";

        String[] str = textForCheck.split(" ");

        for (String s : str) {
            if (Pattern.matches(".*?Error", s)) {
                System.out.print(s + " ");
            }
        }
    }
}
