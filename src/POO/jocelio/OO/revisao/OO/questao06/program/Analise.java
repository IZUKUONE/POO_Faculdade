package POO.jocelio.OO.revisao.OO.questao06.program;

import POO.jocelio.OO.revisao.OO.questao06.entities.Partido;

import java.util.Scanner;

public class Analise {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantos paridos vai desejar colocar: ");
        int n = entrada.nextInt();
        Partido[] partidos = new Partido[n];

        System.out.print("Informe o número de votos minimos: ");
        int numeroDeAssinaturasMinimas = entrada.nextInt();
        for (int i = 0; i < partidos.length; i++) {
            System.out.print("Informe o codigo do partido " + (i + 1) + ": ");
            int codigo = entrada.nextInt();
            System.out.print("Informe o nome do partido " + (i + 1) + ": ");
            String nome = entrada.next();
            System.out.println("Nome do presidente " + (i + 1) + ": ");
            String presidente = entrada.next();
            System.out.println("Quantos filiado o partido " + (i + 1) + " tem: " );
            int fil = entrada.nextInt();
            System.out.println("Quantas assinaturas tem: ");
            int assinatura = entrada.nextInt();

            partidos[i] = new Partido(codigo, nome, presidente, fil, assinatura, numeroDeAssinaturasMinimas);
        }

        for (int i = 0; i < partidos.length; i++) {
            System.out.println(partidos[i].mostrarDados());
        }
    }
}
