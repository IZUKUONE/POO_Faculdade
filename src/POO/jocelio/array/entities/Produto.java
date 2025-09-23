package POO.jocelio.array.entities;

public class Produto {
    private String nome;
    private String codigo;
    private int quantidade;
    private int unidade;
    private double valorUnitario;

    public Produto(String nome, String codigo, int quantidade, int unidade, double valorUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
    }

    // calcula dinamicamente o valor total em estoque
    public double getValorTotal() {
        return quantidade * valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getUnidade() {
        return unidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public String toString() {
        return nome
                + ", $ " + String.format("%.2f", valorUnitario)
                + ", " + quantidade + " units"
                + ", Total: $ " + String.format("%.2f", getValorTotal());
    }
}
