package nelioAlves.memory.vectors;

import java.util.Locale;
import java.util.Scanner;

public class aula01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] a = new double[n];
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            soma += a[i];
        }

        double media = soma / n;
        System.out.println("Media: " + media);
    }


}
