package POO.jocelio.OO.SegundaProva.questao04.entities;

public class Paciente {
    private int codigo;
    private String nome;
    private float debito;

    public Paciente(int codigo, String nome, float debito) {
        this.codigo = codigo;
        this.nome = nome;
        this.debito = debito;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getDebito() {
        return debito;
    }

    public float usarServico(float valorServico){
        return this.debito += valorServico;
    }

    public void pagarServico(float valorServico){
        if(this.debito <= valorServico){
            this.debito -= valorServico;
        }else {
            System.out.println("Valor incoerente");
        }
    }

    public void mostrarDados(){
        System.out.println("Nome: " + this.nome + "\ncodigo: " + this.codigo + "\ndebito: " + this.debito);
    }
}
