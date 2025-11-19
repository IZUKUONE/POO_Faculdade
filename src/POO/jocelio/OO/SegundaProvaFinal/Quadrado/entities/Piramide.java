package POO.jocelio.OO.SegundaProvaFinal.Quadrado.entities;

public class Piramide extends Quadrado {
    private float altura;

    public Piramide(float altura, float lado){
        super(lado);
        this.altura = altura;
    }
    public Piramide(){
        setLado(0);
        altura = 0;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float alturaDoLado(){
        return (float) Math.sqrt(super.getLado()/2 + Math.pow(altura, 2));
    }

    public float areaLateral(){
        return (4 * ((super.getLado() * alturaDoLado()) / 2));
    }

    public float area(){
        float areaBase = super.area();
        return areaBase + areaLateral();
    }

    public float volume(){
        float areaBase = super.area();
        return areaBase * altura/3;
    }

    public void mostrarDados() {
        System.out.println("lado" + getLado() + "Altura" + altura + "Area da Base" + super.area()
        + "Perimetro da base: " + super.perimetro() + "Altura do lado: " + alturaDoLado()
        + "Area lateral: " + areaLateral() + "Area: " + area() + "Volume: " + volume());
    }
}
