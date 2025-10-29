package POO.jocelio.OO.SegundaProva.questao05.entities;

public class Conta {
    private int codigo;
    private String nome;
    private float saldo;

    public Conta(int codigo, String nome, float saldo){
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public float ajustarSaldo(float valorNovo){
       return saldo += valorNovo;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome + "\nNome: " + nome + "\nSaldo: " + saldo );
    }
}
