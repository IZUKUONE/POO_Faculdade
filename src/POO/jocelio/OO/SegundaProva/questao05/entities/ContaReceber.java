package POO.jocelio.OO.SegundaProva.questao05.entities;

public class ContaReceber extends Conta {

    public ContaReceber(int codigo, String nome, float saldo) {
        super(codigo, nome, Math.abs(saldo));
    }

    public void receber(float valor) {
        if(valor < this.getSaldo()) { // lembra do get corno
            super.ajustarSaldo(Math.abs(valor));
        }else {
            System.out.println("Valor incorreto");
        }
    }

    public float vender(float valor){
        return super.ajustarSaldo(valor);
    }

    public void mostrarDados() {
        System.out.println("codigo: " + this.getCodigo() + "\nnome: " + this.getNome() + "\nsaldo: " + this.getSaldo());
    }
}
