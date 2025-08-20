package nelioAlves.introductionToPoo.entities;

public class Product {
    public String name;
    public int quantity;
    public double price;

    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProduct(int quantity){
        // this vai significar que eu quero acessar o atributo da classe (linha 6)
        // não o parametro da função(linha 13)

        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + ", " + String.format("%.2f",totalValueInStock());
    }
}
