package POO.jocelio.OO.SegundaProvaFinal.cubo.program;

import POO.jocelio.OO.SegundaProvaFinal.cubo.entities.Cubo;

import java.util.Scanner;

public class LerCubo {
    public static void main(String[] args) {
        Cubo cubo = new Cubo();

        System.out.print("Digite o lado da base do cubo: ");
        cubo.setLado(new Scanner(System.in).nextFloat());

        do {
            System.out.print("Digite a altura da pirâmide: ");
            cubo.setAltura(new Scanner(System.in).nextFloat());
        } while (cubo.getAltura() == 0);

        System.out.println();
        cubo.mostrarDados();
    }

}
