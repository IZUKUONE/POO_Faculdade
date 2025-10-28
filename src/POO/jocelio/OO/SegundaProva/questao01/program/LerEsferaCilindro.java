package POO.jocelio.OO.SegundaProva.questao01.program;

import POO.jocelio.OO.SegundaProva.questao01.entities.Cilindro;
import POO.jocelio.OO.SegundaProva.questao01.entities.Circulo;
import POO.jocelio.OO.SegundaProva.questao01.entities.Esfera;

import java.util.Scanner;

public class LerEsferaCilindro {
    public static void lerTipo(){
        Scanner sc = new Scanner(System.in);
        Circulo objeto = null;
        String tipo;

        do {
            System.out.println("Digite o tipo (Esfera / Cilindro) ou 'sair' para encerrar:");
            tipo = sc.nextLine();

            if (tipo.equalsIgnoreCase("Esfera")) {
                System.out.print("Digite o raio: ");
                double raio = sc.nextDouble();
                sc.nextLine();

                objeto = new Esfera(raio);

                System.out.println("Dados da Esfera:");
                System.out.println("Raio: " + objeto.getRaio());
                System.out.println("Área: " + objeto.area());


                if (objeto instanceof Esfera) {
                    System.out.println("Volume: " + ((Esfera) objeto).volume());
                }

            } else if (tipo.equalsIgnoreCase("Cilindro")) {
                System.out.print("Digite o raio: ");
                double raio = sc.nextDouble();
                System.out.print("Digite a altura: ");
                double altura = sc.nextDouble();
                sc.nextLine();

                objeto = new Cilindro(raio, altura);

                System.out.println("Dados do Cilindro:");
                System.out.println("Raio: " + objeto.getRaio());
                System.out.println("Altura: " + ((Cilindro) objeto).getAltura());
                System.out.println("Área: " + objeto.area());
                System.out.println("Volume: " + ((Cilindro) objeto).volume());
            }

        } while (!tipo.equalsIgnoreCase("sair"));

        sc.close();
        System.out.println("Programa encerrado.");
    }

    public static void main(String[] args) {
        lerTipo();
    }
}
