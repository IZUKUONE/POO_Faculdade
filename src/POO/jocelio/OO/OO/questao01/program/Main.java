package POO.jocelio.OO.OO.questao01.program;

import POO.jocelio.OO.OO.questao01.entitie.Automovel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Automovel automovel = new Automovel();

        System.out.print("Qual o modelo do carro: ");
        String modelo = entrada.nextLine();

        System.out.print("Qual a marca do carro: ");
        String marca = entrada.nextLine();

        System.out.print("Qual a capacidade do carro: ");
        double capacidadeDoTanque = entrada.nextDouble();

        System.out.println("Qual a quantidade atual do tanque do carro: ");
        double quantidadeAtual = entrada.nextDouble();

        System.out.println("Qual o consumo do carro: ");
        double consumo = entrada.nextDouble();

        System.out.println("Qual a distancia percorrida pelo carro:");
        double distanciaPercorrida = entrada.nextDouble();

        automovel.andar(distanciaPercorrida);

        System.out.println("Quantidade de litros restante no tanque: " + automovel.quantidadeAtual);


    }
}
