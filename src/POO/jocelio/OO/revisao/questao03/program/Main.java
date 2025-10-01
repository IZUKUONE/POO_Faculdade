package POO.jocelio.OO.revisao.questao03.program;

import POO.jocelio.OO.revisao.questao03.entities.Cadidatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos candidatos você deseja inserir? ");
        int n = sc.nextInt();
        Cadidatos[] cadidatos = new Cadidatos[n];

        System.out.println("Informe a quantidade de votos minimos para os candidatos: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < cadidatos.length; i++) {
            System.out.println("Informe o nome do candidato " + (i + 1) + ": ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Informe o numero do candiado " + (i + 1) + ": ");
            int numero = sc.nextInt();
            System.out.println("informe os votos do candidato " + (i + 1) + ": ");
            int votos = sc.nextInt();


            cadidatos[i] = new Cadidatos(numero, votos, nome, quantidade);
        }



        for (int i = 0; i < cadidatos.length; i++) {
            System.out.println(cadidatos[i].toString() + " " + cadidatos[i].Classificado());
        }

        sc.close();
    }
}
