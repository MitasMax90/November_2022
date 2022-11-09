package Cycle;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите пароль: " );
        String passWord = scanner.nextLine();

        if (passWord.length() < 8 || passWord.length() > 15) {
            do {
                System.out.println("Ваш пароль должен быть от 8 до 15 символов");
                passWord = scanner.nextLine();
            } while (passWord.length() < 8 || passWord.length() > 15);
        }
        System.out.printf("%s, Ваш новый пароль: %s", name, passWord);
    }
}
