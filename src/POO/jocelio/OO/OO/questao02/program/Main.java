package POO.jocelio.OO.OO.questao02.program;

import POO.jocelio.OO.OO.questao02.entities.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe quantos retangulos vai gostar de colocar: ");
        Retangulo[] retangulos = new Retangulo[sc.nextInt()];

        for (int i = 0; i < retangulos.length; i++) {
            System.out.print("Base do retângulo " + (i + 1) + ": ");
            double base = sc.nextDouble();

            System.out.print("Altura do retângulo " + (i + 1) + ": ");
            double altura = sc.nextDouble();

            retangulos[i] = new Retangulo(base, altura);
        }

        System.out.println("Retangulos cadastrados com sucesso!");
        System.out.println("retangulo 01: " + retangulos[0]);


    }
}
