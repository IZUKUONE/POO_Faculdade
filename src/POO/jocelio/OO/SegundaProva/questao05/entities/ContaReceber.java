package POO.jocelio.OO.SegundaProva.questao05.entities;

public class ContaReceber extends Conta {

    public ContaReceber(int codigo, String nome, float saldo) {
        super(codigo, nome, Math.abs(saldo));
    }

    public void receber(float valorRecebido) {
        if(valorRecebido < this.getSaldo()) { // lembra do get corno
            super.ajustarSaldo(-valorRecebido);
        }else {
            System.out.println("Valor incorreto");
        }
    }

    public float vender(float valorVenda){
        return super.ajustarSaldo(valorVenda);
    }

    public void mostrarDados() {
        System.out.println("codigo: " + this.getCodigo() + "\nnome: " + this.getNome() + "\nsaldo: " + this.getSaldo());
    }
}
