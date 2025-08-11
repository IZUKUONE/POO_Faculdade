package nelioAlves.exercise1;

import java.util.Locale;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio;
        double area;

        raio = sc.nextDouble();
        area = 3.14159 * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f", area);

    }
}
