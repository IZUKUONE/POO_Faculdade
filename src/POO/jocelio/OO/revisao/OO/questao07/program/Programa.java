package POO.jocelio.OO.revisao.OO.questao07.program;

import POO.jocelio.OO.revisao.OO.questao07.entities.Automovel2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe quantos atumovoeis deseja adicionar: ");
        int n = entrada.nextInt();

        Automovel2[] automovel = new Automovel2[n];

        for (int i = 0; i < automovel.length; i++) {
            System.out.println("Informe o codigo do seu automovel: ");
            int codigo = entrada.nextInt();
            entrada.nextLine();
            System.out.println("informe a descrição do seu autmomvel: ");
            String descricao = entrada.nextLine();
            System.out.println("Informe quantos litros foram abastecidos: ");
            double litrodAbastecidos = entrada.nextDouble();
            System.out.println("Informe a kilometragem rodada: ");
            double kilometragemRodadda = entrada.nextDouble();
            entrada.nextLine();
            automovel[i] = new Automovel2(codigo, descricao, litrodAbastecidos, kilometragemRodadda);
        }

        for (int i = 0; i < automovel.length; i++) {
            System.out.println(automovel[i].mostrarDados());
        }

    }
}
