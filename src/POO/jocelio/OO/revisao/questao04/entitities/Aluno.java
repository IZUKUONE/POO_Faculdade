package POO.jocelio.OO.revisao.questao04.entitities;

public class Aluno {
    public int codigo;
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public Aluno(int codigo, String nome, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double media() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public double media(double peso1, double peso2, double peso3) {
        return ((nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3));
    }

    public String toString() {
        return "codigo: " + codigo
                + " Nome: " + nome
                + " nota 1: " + nota1
                + " nota 2: " + nota2
                + " nota 3: " + nota3
                + " media: " + media();
    }
}
