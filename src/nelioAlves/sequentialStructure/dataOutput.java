package nelioAlves.sequentialStructure;

import java.util.Locale;

public class dataOutput {
    public static void main(String[] args) {
        double x = 10.102325;
        System.out.printf("%.2f%n", x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
    }
}
