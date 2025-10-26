package POO.jocelio.OO.revisao.Polimorfismo.questao01.entities;

public class Cilindro extends Circulo{
    private double altura;

    public Cilindro() {
        super();
        this.altura = 0;
    }

    public Cilindro(double raio, double altura) {
        super(raio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        }
    }

    public double areaLateral(){
        return super.perimetro() * altura;
    }

    public double area(){
        return (2 * (super.area() + areaLateral()));
    }

    public double volume(){
        return (super.area() * altura);
    }

    public void mostrarDados() {
        System.out.println("Raio: " + super.getRaio() + "\nAltura: " + altura + "\nArea: " + area()
                + "\nPerimetro: " + super.perimetro()
                + "\nDiâmetro: " + super.diametro()
                + "\nÁrea lateral: " + areaLateral()+ "\nvolume: " + volume());
    }
}
