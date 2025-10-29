package POO.jocelio.OO.SegundaProva.questao05.entities;

public class ContaPagar extends Conta{
    public ContaPagar(int codigo, String nome, float saldo) {
        super(codigo, nome, -Math.abs(saldo));
    }

    public void pagar(float valor){
        if(Math.abs(this.getSaldo()) >= valor){
            super.ajustarSaldo(valor);
        }else {
            System.out.println("Valor insuficiente");
        }
    }

    public float comprar(float valorVenda) {
        return super.ajustarSaldo(-valorVenda);
    }
}
