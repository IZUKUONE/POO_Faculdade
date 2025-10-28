package POO.jocelio.OO.OO.questao01.entitie;

public class Automovel {
    public String chassi;
    public String modelo;
    public String marca;
    public double capacidadeDoTanque;
    public double quantidadeAtual;
    public double consumo;
    public double distancia;

    public Automovel() {
    }

    public void andar(double distancia) {
        if (consumo <= 0) {
            System.out.println("Erro: consumo inválido (zero ou negativo).");
            return;
        }

        double litrosGastos = distancia / consumo;
        quantidadeAtual -= litrosGastos;

        if (quantidadeAtual < 0) {
            quantidadeAtual = 0;
        }
    }
}
