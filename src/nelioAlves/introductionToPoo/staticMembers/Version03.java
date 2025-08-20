package nelioAlves.introductionToPoo.staticMembers;

import nelioAlves.introductionToPoo.staticMembers.util.Calculator02;

import java.util.Scanner;

public class Version03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator02.circumference(radius);

        double v = Calculator02.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator02.PI);
    }
}
