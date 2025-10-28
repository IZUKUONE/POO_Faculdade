package POO.jocelio.OO.SegundaProva.questao04.entities;

public class PacienteParticular extends Paciente {
    private int desconto;

    public PacienteParticular(int codigo, String nome, float debito, int desconto) {
        super(codigo, nome, debito);
        this.desconto = 0;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public float usarServico(float valor){
        return valor * (1 - (float) desconto / 100);
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Desconto: " + desconto);
    }
}
