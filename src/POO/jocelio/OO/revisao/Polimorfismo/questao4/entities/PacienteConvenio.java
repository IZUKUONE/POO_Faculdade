package POO.jocelio.OO.revisao.Polimorfismo.questao4.entities;

public class PacienteConvenio extends Paciente{
    private String convenio;
    private float limite;

    public PacienteConvenio(int codigo, String nome, float debito, String convenio, float limite) {
        super(codigo, nome, debito);
        this.limite = 0;
        this.convenio = "";
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public boolean checarLimite(float valor) {
        if ((valor + super.getDebito()) <= limite) {
            return true;
        }else {
            return false;
        }
    }

    public void usarServico(){
        if (checarLimite(limite)) {
            System.out.println("Convenio feito com sucesso!");
        }else {
            System.out.println("Negado");
        }
    }

    public void mostarDados(){
        super.mostrarDados();
        System.out.println("Convenio: " + convenio + "\nLimite: " + limite);
    }
}
