package nelioAlves.exercise1;

import java.util.Locale;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int code1;
        int code2;

        int number1;
        int number2;

        double value1;
        double value2;

        double valueAll;
        code1 = Integer.parseInt(in.nextLine());
        code2 = Integer.parseInt(in.nextLine());

        number1 = Integer.parseInt(in.nextLine());
        number2 = Integer.parseInt(in.nextLine());

        value1 = Double.parseDouble(in.nextLine());
        value2 = Double.parseDouble(in.nextLine());

        valueAll = (number1 * value1) + (number2 * value2);
        System.out.printf("R$ %.2f", valueAll);
    }
}
