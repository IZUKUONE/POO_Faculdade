package POO.jocelio.OO.revisao.OO.questao07.entities;

public class Automovel2 {
    public int codigo;
    public String descricao;
    public double capacidadeDoTanque;
    public double litrodAbastecidos;
    public double kilometragemRodadda;

    public Automovel2(int codigo, String descricao, double litrodAbastecidos, double kilometragemRodadda) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.litrodAbastecidos = litrodAbastecidos;
        this.kilometragemRodadda = kilometragemRodadda;
        //this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public double consumo() {
        return kilometragemRodadda / litrodAbastecidos;
    }

    public double consumo(double litrodAbastecidos) {
        return kilometragemRodadda / litrodAbastecidos;
    }

    public String classificacao() {
        if(consumo() < 10){
            return "ruim";
        }
        else if (consumo() >= 10 && consumo() <= 13){
            return "normal";
        }
        else {
            return "otimo";
        }
    }

    public String mostrarDados() {
        return "Codigo: " + codigo
                + " Descricao: " + descricao
                + " Litrodabastecidos: " + litrodAbastecidos
                + " KilometragemRodadda: " + kilometragemRodadda
                + " Consumo: " + consumo()
                + " Classificação: " + classificacao();

    }
}
