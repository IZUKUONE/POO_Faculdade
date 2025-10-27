package POO.jocelio.OO.revisao.OO.questao06.entities;

public class Partido {
    public int codigo;
    public String descricao;
    public String presidente;
    public int filiados;
    public int assinaturas;
    public int numeroDeAssinaturasMinimas;
// triste
    public Partido(int codigo, String descricao, String presidente, int filiados, int assinaturas, int numeroDeAssinaturasMinimas) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.presidente = presidente;
        this.filiados = filiados;
        this.assinaturas = assinaturas;
        this.numeroDeAssinaturasMinimas = numeroDeAssinaturasMinimas;
    }

    public String aprovado(){
        return (assinaturas >= 491656) ? "sim" : "não";
    }

    public String aprovado(int numeroDeAssinaturasMinimas){
        return (assinaturas >= numeroDeAssinaturasMinimas) ? "Sim" : "Não";
    }

    public String classificacao(int numeroDeAssinaturasMinimas){
        double indice = ((double) assinaturas / numeroDeAssinaturasMinimas);
        //double indice = ((double) assinaturas / numeroDeAssinaturasMinimas);

        if (indice >= 75) {
            return "Insatisfatorio";
        } else if (indice >= 50) {
            return "Ruim";
        } else if (indice >= 25) {
            return "Muito ruim";
        } else {
            return "Péssimo";
        }
    }

    public String mostrarDados(){
        return "Num: " + codigo
                +" Nome: " + descricao
                +" Presidente: " + presidente
                +" Filiados: " + filiados
                +" Assinaturas: " + assinaturas
                +" Aprovado: " + aprovado(numeroDeAssinaturasMinimas)
                +" Classificação: " + classificacao(numeroDeAssinaturasMinimas);
    }

}