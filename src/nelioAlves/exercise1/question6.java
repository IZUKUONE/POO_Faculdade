package nelioAlves.exercise1;

import java.util.Locale;
import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A;
        double B;
        double C;

        double triagulation;
        double circumference;
        double trapezium;
        double quadratic;
        double rectangle;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triagulation = (A * C)/2;
        circumference = 3.14159 * (Math.pow(C, 2));
        trapezium = (A + B) / 2.0 * C;
        quadratic = B * B;
        rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triagulation);
        System.out.printf("CIRCUMFERENCE: %.3f%n", circumference);
        System.out.printf("TRAPEZIUM: %.3f%n", trapezium);
        System.out.printf("QUADRATIC: %.3f%n", quadratic);
        System.out.printf("RECTANGLE: %.3f%n", rectangle);

        sc.close();
    }
}
