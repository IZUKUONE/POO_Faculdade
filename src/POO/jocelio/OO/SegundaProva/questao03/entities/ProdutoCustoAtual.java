package POO.jocelio.OO.SegundaProva.questao03.entities;

public class ProdutoCustoAtual extends Produto {

    public ProdutoCustoAtual(int codigo, String nome, float quantidade, float custo) {
        super(codigo, nome,quantidade,custo);
    }

    public void repor (float quantidade, float custo) {
        super.setCusto (custo) ; //super.custo = custo;
        super.repor(quantidade, custo);
    }
}
