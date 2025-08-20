package nelioAlves.introductionToPoo.exercise;

import nelioAlves.introductionToPoo.exercise.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.print(rectangle);

        sc.close();
    }
}
