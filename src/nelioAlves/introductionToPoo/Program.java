package nelioAlves.introductionToPoo;

import nelioAlves.introductionToPoo.entities.Product;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("name: ");
        product.name = sc.nextLine();
        System.out.println("price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.print("Product data: " + product);
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println("Update product: " + product);

        System.out.println("Enter the number of products to be remove in stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println("Update product: " + product);



        sc.close();
    }
}
