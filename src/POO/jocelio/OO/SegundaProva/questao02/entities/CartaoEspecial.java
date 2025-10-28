package POO.jocelio.OO.SegundaProva.questao02.entities;

public class CartaoEspecial extends Cartao{
    private double valorMinimo;

    public CartaoEspecial(String numeroDoCartao, String titular, double limiteDeCredito, double v) {
        super(numeroDoCartao, titular, limiteDeCredito);
        this.valorMinimo = limiteDeCredito;
    }
    public double getValorMinimo() {
        return valorMinimo;
    }
    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public void comprar(double valorCompra){
        if (valorCompra >= valorMinimo) {
            super.comprar(valorCompra);
        } else {
            System.out.println("ERRO: Valor mínimo para compra é R$ " +
                    String.format("%.2f", valorMinimo));
        }
    }

    public void pagarTudo() {
        double valorPago = getSaldoDevedor();
        if (valorPago > 0) {
            pagar(valorPago);
            System.out.println("Saldo devedor quitado totalmente!");
        } else {
            System.out.println("Não há saldo devedor a ser pago.");
        }
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("\nValor minimo: " + valorMinimo);
    }

}
