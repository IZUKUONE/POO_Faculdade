package POO.jocelio.OO.revisao.questao03.entities;

public class Cadidatos {
    public int numero;
    public String nome;
    public int votos;
    public int votosMinimos;

    public Cadidatos(int numero, int votos, String nome, int votosMinimos) {
        this.numero = numero;
        this.nome = nome;
        this.votos = votos;
        this.votosMinimos = votosMinimos;
    }

    public boolean Classificado(int votosMinimos) {
        return votos >= votosMinimos;
    }

    public String Classificado() {
        if (votos >= this.votosMinimos) {
            return "Sim, Excedeu " + (votos - this.votosMinimos) + " voto(s)";
        } else {
            return "Não, Faltou " + (this.votosMinimos - votos) + " voto(s)";
        }
    }

    public String toString() {
        return "numero: " + numero + ", nome: " + nome + ", votos: " + votos;
    }

}
