package POO.jocelio.OO.revisao.Polimorfismo.questao4.entities;

public class Paciente {
    private String codigo;
    private String nome;
    private float debito;

    public Paciente(String codigo, String nome, float debito) {
        this.codigo = codigo;
        this.nome = nome;
        this.debito = debito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getDebito() {
        return debito;
    }

    public float usarServico(float valorServico){
        this.debito += valorServico;
        return valorServico;
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
