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

        for (int i = 0; i < produtos.length; i++) {
            totalEstoque += produtos[i].getValorTotal();
        }

        System.out.println("\nThe total value of your stock is: R$ " + totalEstoque);





/*
        double valorTotal = 0;
        System.out.println("YOUR MARKET INVENTORY");

        System.out.print("tell me the name of the product:");
        String name = sc.nextLine();
        System.out.print("tell me the product code:");
        String codigo = sc.nextLine();
        System.out.print("let me know the quantity of the product:");
        int quantidade = sc.nextInt();
        System.out.print("tell me the product unit:");
        int unidade = sc.nextInt();
        System.out.print("Please inform me the unit price of the product:");
        double valorUnitario = sc.nextDouble();

        Produto p = new Produto(name, codigo, quantidade, unidade, valorUnitario);

        valorTotal = quantidade * valorUnitario;

        System.out.println("Your total price is: " + valorTotal);


*/



    }
}
