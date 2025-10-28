package POO.jocelio.OO.OO.questao02.entities;

public class Retangulo {
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area(double base, double altura) {
        return base*altura;
    }
    public double perimetro(double base, double altura) {
        return (2 * (base + altura));
    }

}
