package POO.jocelio.OO.revisao.Polimorfismo.questao05.entities;

public class Veiculo {
    private String placa;
    private String modelo;
    private float valorAluguel;

    public Veiculo(String placa, String modelo, float valorAluguel) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorAluguel = valorAluguel;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

}
