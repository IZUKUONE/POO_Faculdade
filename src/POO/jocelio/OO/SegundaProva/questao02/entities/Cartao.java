package POO.jocelio.OO.SegundaProva.questao02.entities;

public abstract class Cartao {
    private String numeroDoCartao;
    private String titular;
    private double limiteDeCredito;
    private double saldoDevedor;

    public Cartao(String numeroDoCartao, String titular, double limiteDeCredito) {
        this.numeroDoCartao = numeroDoCartao;
        this.titular = titular;
        this.limiteDeCredito = limiteDeCredito;
        this.saldoDevedor = 0;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }
    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }
    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public boolean autorizar(double valorCompra){
        if ((valorCompra + saldoDevedor) <= limiteDeCredito) {
            saldoDevedor += valorCompra;
            return true;
        }else {
            return false;
        }
    }

    public void comprar(double valorCompra){
        if (autorizar(valorCompra)) {
            saldoDevedor += valorCompra; // Soma ao saldo devedor
            System.out.println("Compra autorizada com sucesso!");
        } else {
            System.out.println("Erro: Compra não autorizada - limite insuficiente!");
        }
    }

    public void pagar(double valorPagamento){
        if (saldoDevedor != 0){
            saldoDevedor -= valorPagamento;
        }else {
            System.out.println("Você não deve nada");
        }
    }

    public void mostrarDados(){
        System.out.println("Numero do cartao: " + numeroDoCartao
                + "\nTitular: " + titular
                + "\nLimite: " + limiteDeCredito
                + "\nSaldo: " + saldoDevedor);
    }
}
