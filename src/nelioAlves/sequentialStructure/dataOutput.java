package nelioAlves.sequentialStructure;

import java.util.Locale;

public class dataOutput {
    public static void main(String[] args) {
        double x = 10.102325;
        System.out.printf("%.2f%n", x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);


        /*--------------------------------------------------------*/

        String nome = "Maria";
        int idade = 20;
        double renda = 400.0;
        System.out.printf("%s tem %d anos e ganha %.2f Reais", nome, idade, renda);
    }
}
