package POO.jocelio.OO.SegundaProvaFinal.cubo.entities;

public class Cubo extends Quadrado{
    private float altura;

    public Cubo() {}
    public Cubo(float lado, float altura) {
        super(lado);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float area(){
        return 6 * super.area();
    }

    public float volume(){
        return super.area() * altura;
    }

    public void mostrarDados(){
        System.out.println("lado: " + this.getLado() + "\nArea: " + area() + "\nVolume: " + volume());
    }

}
