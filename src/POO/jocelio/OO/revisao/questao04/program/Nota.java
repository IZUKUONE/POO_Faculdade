package POO.jocelio.OO.revisao.questao04.program;

import POO.jocelio.OO.revisao.questao04.entitities.Aluno;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a qunatidade de alunos: ");
        int quantidade = sc.nextInt();
        Aluno[] alunos = new Aluno[quantidade];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Informe o codigo do aluno: ");
            int codigo = sc.nextInt();
            System.out.println("Informe o nome do aluno: " + (i + 1) + ":");
            String nome = sc.next();
            System.out.println("Informe a nota 1 do aluno: " + (i + 1) + ":");
            double nota = sc.nextDouble();
            System.out.println("Informe a nota 2 do aluno: " + (i + 1) + ":");
            double nota2 = sc.nextDouble();
            System.out.println("Informe a nota 3 do aluno: " + (i + 1) + ":");
            double nota3 = sc.nextDouble();

            alunos[i] = new Aluno(codigo, nome, nota, nota2, nota3);
        }

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].toString());
        }

        Aluno maiorMedia = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].media() > maiorMedia.media()){
                maiorMedia = alunos[i];
            }
        }
        Aluno menorMedia = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].media() < menorMedia.media()){
                menorMedia = alunos[i];
            }
        }
        double somaMedias = 0;
        for (int i = 0; i < alunos.length; i++) {
            somaMedias += alunos[i].media();
        }
        double mediaDasMedias = somaMedias / alunos.length;

        System.out.println("Aluno com maior média é: " + maiorMedia.nome + " com " + maiorMedia.media());
        System.out.println("Aluno com menor média é : " + menorMedia.nome + " com " + menorMedia.media());
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}
