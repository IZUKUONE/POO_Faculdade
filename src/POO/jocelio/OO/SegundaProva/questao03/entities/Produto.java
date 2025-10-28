package POO.jocelio.OO.SegundaProva.questao03.entities;

public abstract class Produto {
    private int codigo;
    private String nome;
    private float quantidade;
    private float custo;

    public Produto(int codigo, String nome, float quantidade, float custo) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorEstoque() {
        return quantidade * custo;
    }

    public void repor (float quantidade, float custo) {
        this.quantidade += quantidade;
    }

    public boolean validarSaldo(float quantidade){
        return this.quantidade >= quantidade;
    }

    public void baixar(float quantidade){
        if (this.validarSaldo(quantidade)){
            this.quantidade -= quantidade;
        }else {
            System.out.println("Não pode ser baixado");
        }
    }

    public void mostrarDados(){
        System.out.println("Codigo: " + codigo + "\nNome: " + nome
                + "\nQuantidade: " + quantidade + "\nCusto: " + custo + "\nValor: " + getValorEstoque());
    }

}
