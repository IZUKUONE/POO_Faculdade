package nelioAlves.memory.vectors;

import nelioAlves.memory.vectors.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vector = new Product[n];

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            String name = sc.next();
            int price = sc.nextInt();
            vector[i] = new Product(name, price);
        }

        double soma = 0.0;
        for (int i = 0; i < vector.length; i++) {
            soma += vector[i].getPrice();
        }

        double media = soma / vector.length;
        System.out.println("Media: " + media);

        sc.close();
    }
}
