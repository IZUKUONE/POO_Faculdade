package POO.jocelio.array.program;

import POO.jocelio.array.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products do you want to register? ");
        int n = sc.nextInt();
        sc.nextLine();

        Produto[] produtos = new Produto[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.println("code");
            String code = sc.nextLine();

            System.out.println("Quantity");
            int quantity = sc.nextInt();

            System.out.println("Unit");
            int unit = sc.nextInt();

            System.out.println("Price");
            double price = sc.nextDouble();
            sc.nextLine();

            produtos[i] = new Produto(name, code, quantity, unit, price);

        }

        double totalEstoque = 0;

        Produto maisCaro = produtos[0];
        Produto maisBarato = produtos[0];
        Produto maisUnidades = produtos[0];
        Produto menosUnidades = produtos[0];
        Produto maisValioso = produtos[0];
        Produto menosValioso = produtos[0];

        for (Produto p : produtos) {
            totalEstoque += p.getValorTotal();

            if (p.getValorUnitario() > maisCaro.getValorUnitario()) {
                maisCaro = p;
            }
            if (p.getValorUnitario() < maisBarato.getValorUnitario()) {
                maisBarato = p;
            }
            if (p.getQuantidade() > maisUnidades.getQuantidade()) {
                maisUnidades = p;
            }
            if (p.getQuantidade() < menosUnidades.getQuantidade()) {
                menosUnidades = p;
            }
            if (p.getValorTotal() > maisValioso.getValorTotal()) {
                maisValioso = p;
            }
            if (p.getValorTotal() < menosValioso.getValorTotal()) {
                menosValioso = p;
            }
        }

        System.out.println("Most expensive product: " + maisCaro);
        System.out.println("Cheapest product: " + maisBarato);
        System.out.println("Product with most units: " + maisUnidades);
        System.out.println("Product with least units: " + menosUnidades);
        System.out.println("Most valuable product in stock: " + maisValioso);
        System.out.println("Least valuable product in stock: " + menosValioso);
        System.out.println("Total stock value: R$ " + totalEstoque);

    }
}
