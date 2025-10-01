package POO.jocelio.OO.revisao.questao06.entities;

public class Partido {
    public int codigo;
    public int filiado;
    public String presidente;
    public int assinatura;
    public int votosMinimos;

    public Partido(int codigo, int filiado, String presidente, int assinatura) {
        this.codigo = codigo;
        this.filiado = filiado;
        this.presidente = presidente;
        this.assinatura = assinatura;
    }

    public boolean aprovado(int votosMinimos) {
        return assinatura >= votosMinimos;
    }

    public boolean aprovado(){
        return assinatura >= 491656;
    }
}
