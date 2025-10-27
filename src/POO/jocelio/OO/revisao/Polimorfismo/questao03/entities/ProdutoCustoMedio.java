package POO.jocelio.OO.revisao.Polimorfismo.questao03.entities;

public class ProdutoCustoMedio extends Produto{

    public ProdutoCustoMedio(int codigo, String nome, float quantidade, float custo) {
        super(codigo, nome, quantidade, custo);
    }

    public void repor(float quantidade, float custo) {
    super.setCusto((float) ((super.getQuantidade() * super.getCusto()) +  (quantidade *custo) / (super.getQuantidade() + quantidade)));
    super.repor(quantidade, custo);
    }
}
