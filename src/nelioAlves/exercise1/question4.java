package nelioAlves.exercise1;

import java.util.Locale;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int officials;
        int hours;
        double value;
        double salary;

        officials = sc.nextInt();
        hours = sc.nextInt();
        value = sc.nextDouble();

        salary = value * hours;
        System.out.printf("Number: %d%nSalary: %.2f%n", officials, salary);



    }
}
