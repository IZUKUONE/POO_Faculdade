package POO.jocelio.OO.SegundaProvaFinal.cubo.entities;

public abstract class Quadrado {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }
    public Quadrado() {
        this.lado = 0;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float area(){
        return (float) Math.pow(lado, 2);
    }


    public float perimetro(){
        return 4 * lado;
    }
}
