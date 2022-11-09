public class CalculatePerimeters {
    public static void main(String[] args) {

        int sideLengthTriangle = 4;
        int sideLengthSquare = 3;
        int radiusCircle = 5;

        System.out.println("Perimetr triangle = " + perimetrTriangle(sideLengthTriangle));
        System.out.println("Perimetr square = " + perimetrSquare(sideLengthSquare));
        System.out.println("Perimetr circle = " + perimetrCircle(radiusCircle));



    }

    private static int perimetrTriangle(int length) {
        int p = 3 * length;
        return p;
    }

    private static int perimetrSquare(int length) {
        int p = 4 * length;
        return p;
    }

    private static double perimetrCircle(int radius) {
        double PI = 3.14159;
        double r = 2 * PI * radius;
        return r;

    }
}
