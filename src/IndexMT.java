import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IndexMT {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите вес :");
        double weight = Double.parseDouble(br.readLine());
        System.out.println("Введите рост :");
        double height = Double.parseDouble(br.readLine());
        BodyMass.massIndex(weight,weight);

    }

    public static class BodyMass {
        public static void massIndex(double weight, double height) {
            double iMt = weight/ Math.pow(height, 2);

            if (iMt <= 19) {
                System.out.println("Недостаточная масса тела (дефицит)");
            } else if (iMt > 19 && iMt <= 25) {
                System.out.println("Норма");
            } else if (iMt > 25 && iMt <= 40) {
                System.out.println("Вы жирный, срочно худеть");
            } else {
                System.out.println("Всё печально!");
            }
        }
    }
}
