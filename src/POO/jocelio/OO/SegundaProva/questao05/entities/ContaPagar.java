package POO.jocelio.OO.SegundaProva.questao05.entities;

public class ContaPagar extends Conta{
    public ContaPagar(int codigo, String nome, float saldo) {
        super(codigo, nome, -Math.abs(saldo));
    }

    public void pagar(float valorRecebido){
        if(this.getSaldo() > valorRecebido){
            super.ajustarSaldo(valorRecebido);
        }else {
            System.out.println("Valor insuficiente");
        }
    }

    public float comprar (float valorVenda){
        return super.ajustarSaldo(-valorVenda);
    }
}
