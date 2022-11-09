import java.util.Random;
import java.util.Scanner;

public class RandNumb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество попыток: ");
        int numOfGuess = scanner.nextInt();

        System.out.println("Введите нижний предел: ");
        int lowerBound = scanner.nextInt();

        System.out.println("Введите верхний предел: ");
        int upperBound = scanner.nextInt();

        Random rand = new Random();
        int randInt = lowerBound + rand.nextInt(upperBound - lowerBound + 1);
//        System.out.println("Загаданное число " + randInt);

        boolean status = false;
        int counter = 1;

        while (counter <= numOfGuess) {
            System.out.println("Введите предполагаемое число");
            int userInput = scanner.nextInt();

            if (randInt == userInput) {
                System.out.println("Поздравляем, Вы угадали!");
                status = true;
                break;
            } else if (randInt > userInput) {
                System.out.println("Загаданное число больше");
                status = false;
            } else {
                System.out.println("Загаданное число меньше");
                status = false;
            }

            counter++;
        }
        if (status == false) {
            System.out.println("Конец игры");
            System.out.println("Мною было загадано число " + randInt);
        }
    }
}
