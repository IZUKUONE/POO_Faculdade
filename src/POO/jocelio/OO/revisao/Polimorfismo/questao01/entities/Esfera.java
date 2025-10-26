package POO.jocelio.OO.revisao.Polimorfismo.questao01.entities;

public class Esfera extends Circulo {

    public Esfera() {
        super();
    }

    public Esfera(double raio) {
        super(raio);
    }

    public double area(){
        return (4 * super.area());
    }

    public double volume(){
        return (((double) 4 /3) * Math.PI * Math.pow(super.getRaio(), 3));
    }

    public void mostrarDados(){
        System.out.println("Raio: " + super.getRaio() + "\nArea: " + area() + "\nVolume: " + volume());
    }
}
