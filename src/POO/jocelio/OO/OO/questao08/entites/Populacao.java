package POO.jocelio.OO.OO.questao08.entites;

public class Populacao {
    public int codigo;
    public String descricao;
    public double populacao;
    public double area;
    public double densidadeIdeal;

    public Populacao(int codigo, String descricao, double populacao, double area, double densidadeIdeal) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.populacao = populacao;
        this.area = area;
        this.densidadeIdeal = densidadeIdeal;
    }

    public double densidadeDemografica(){
        return populacao / area;
    }

    public double densidadeDemografica(double area){
        return populacao / area;
    }

    public String densidadeIdeall(){
        return (densidadeIdeal >= densidadeDemografica()) ? "Sim" : "Não";
    }

    public String mostrarDados(){
        return "Codigo: " + codigo
                + " Descricao: " + descricao
                + " Populacao: " + populacao
                + " Area: " + area
                + " Densidade: " + densidadeDemografica()
                + " Ideal: " + densidadeIdeall();
    }
}
