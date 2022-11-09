import java.util.Scanner;

public class AgeLimit {
    public static void main(String[] args) {
        System.out.println("Введите возраст клиента: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 14) {
            System.out.println("Прокол ушей в присутствии родителей");
        } else if (age > 14 && age < 18) {
            System.out.println("Прокол ушей, пупка, языка, носа в присутствии родителей");
        } else {
            System.out.println("Без ограничений");
        }
    }
}
