package POO.jocelio.OO.SegundaProva.questao06.entities;

public abstract class Cartao {
    private int numero;
    private String nomeTitular;
    private float limiteCredito;
    private float saldoDevedor;

    public Cartao(int numero, String nomeTitular, float limiteCredito) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.limiteCredito = limiteCredito;
        this.saldoDevedor = 0;
    }

    public int getNumero() { return this.numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getNomeTitular() { return this.nomeTitular; }
    public void setNomeTitular(String nomeTitular) { this.nomeTitular = nomeTitular; }

    public float getLimiteCredito() { return this.limiteCredito; }
    public void setLimiteCredito(float limiteCredito) { this.limiteCredito = limiteCredito; }

    public float getSaldoDevedor() { return this.saldoDevedor; }

    public boolean autorizar(float valor) {
        return (valor + this.saldoDevedor) <= this.limiteCredito;
    }

    public void comprar(float valor) {
        if (autorizar(valor)) {
            this.saldoDevedor += valor;
        } else {
            System.out.println("Compra não autorizada. Limite insuficiente.");
        }
    }

    public void pagar(float valor) {
        this.saldoDevedor -= valor;
        if (this.saldoDevedor < 0)
            this.saldoDevedor = 0; // evita saldo negativo
    }

    public void mostrarDados() {
        System.out.println("numero " + this.numero +
                " nome " + this.nomeTitular +
                " limite " + this.limiteCredito +
                " saldo " + this.saldoDevedor);
    }
}
