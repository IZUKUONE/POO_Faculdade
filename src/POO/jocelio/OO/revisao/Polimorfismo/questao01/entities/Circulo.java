package POO.jocelio.OO.revisao.Polimorfismo.questao01.entities;

public class Circulo {
    private double raio;

    public Circulo(){
        this.raio = 0;
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double diametro(){
        return (raio * 2);
    }

    public double area(){
        return (Math.PI * Math.pow(raio, 2));
    }

    public double perimetro(){
        return (2 * Math.PI * raio);
    }

    public void mostrarDados(){
        System.out.println("Raio: " + raio + "\nDiametro: "
                + diametro() + "\nArea: "
                + area() + "\nPerimetro: "
                + perimetro());
    }
}
