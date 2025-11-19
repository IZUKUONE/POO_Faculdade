package POO.jocelio.OO.SegundaProva.questao06.entities;

public class CartaoEspecial extends Cartao {
    private float valorMinimoCompra;

    public CartaoEspecial(int numero, String nomeTitular, float limiteCredito, float valorMinimoCompra) {
        super(numero, nomeTitular, limiteCredito);
        this.valorMinimoCompra = valorMinimoCompra;
    }

    public float getValorMinimoCompra() { return this.valorMinimoCompra; }
    public void setValorMinimoCompra(float valorMinimoCompra) { this.valorMinimoCompra = valorMinimoCompra; }

    public void comprar(float valor) {
        if (valor < this.valorMinimoCompra) {
            System.out.println("Valor mínimo para compra é R$ " + this.valorMinimoCompra);
        } else {
            super.comprar(valor);
        }
    }

    public void pagarTudo() {
        this.pagar(this.getSaldoDevedor());
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("valor mínimo compra " + this.valorMinimoCompra);
    }

}
