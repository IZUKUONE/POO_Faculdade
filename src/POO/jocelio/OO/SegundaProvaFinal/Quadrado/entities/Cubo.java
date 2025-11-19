package POO.jocelio.OO.SegundaProvaFinal.Quadrado.entities;

public class Cubo extends Quadrado {
    private float altura;

    public Cubo(float altura, float lado) {
        super(lado);
        this.altura = altura;
    }

    public Cubo() {
    }

    public float area() {
        float areaBase = super.area();
        return (6 * areaBase);
    }

    public double volume() {
        double areaBase = super.area();
        return areaBase * this.altura;
    }

    public void mostrarDados(){
        System.out.println("Lado: " + this.getLado() + "Area: " + area() + "Volume: " + volume() );
    }

}
