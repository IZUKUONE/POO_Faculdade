package POO.jocelio.OO.OO.questao08.program;

import POO.jocelio.OO.OO.questao08.entites.Populacao;

import java.util.Locale;
import java.util.Scanner;

public class Cidade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas cidades deseja colocar? ");
        int n = entrada.nextInt();
        entrada.nextLine();

        Populacao[] populacao = new Populacao[n];

        System.out.println("Informe a densidade ideal: ");
        double densidadeIdeal = entrada.nextDouble();
        entrada.nextLine();

        for (int i = 0; i < populacao.length; i++) {
            System.out.print("Informe o nome da cidade " + (i + 1) + ": ");
            String nome = entrada.nextLine();

            System.out.print("Informe o codigo da cidade " + (i + 1) + ": ");
            int codigo = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Informe a população da cidade " + (i + 1) + ": ");
            double popula = entrada.nextLong();
            entrada.nextLine();

            System.out.print("Informe a area da cidade " + (i + 1) + ": ");
            double area = entrada.nextDouble();
            entrada.nextLine();

            populacao[i] = new Populacao(codigo, nome, popula, area, densidadeIdeal);
        }

        for (int i = 0; i < populacao.length; i++) {
            System.out.println(populacao[i].mostrarDados());
        }

        entrada.close();


    }
}
