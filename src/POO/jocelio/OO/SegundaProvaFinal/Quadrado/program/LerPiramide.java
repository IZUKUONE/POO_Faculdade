package POO.jocelio.OO.SegundaProvaFinal.Quadrado.program;

import POO.jocelio.OO.SegundaProvaFinal.Quadrado.entities.Piramide;

import java.util.Scanner;

public class LerPiramide {
    public static void main(String[] args) {
        Piramide piramide = new Piramide();  // ÚNICA VARIÁVEL DO PROGRAMA

        System.out.println("=== PROGRAMA LER PIRÂMIDE ===\n");

        System.out.print("Digite o lado da base da pirâmide: ");
        piramide.setLado(new Scanner(System.in).nextFloat());

        do {
            System.out.print("Digite a altura da pirâmide: ");
            piramide.setAltura(new Scanner(System.in).nextFloat());
        } while (piramide.getAltura() == 0);

        System.out.println();
        piramide.mostrarDados();
    }
}
