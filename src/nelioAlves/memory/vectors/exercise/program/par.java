package nelioAlves.memory.vectors.exercise.program;

import java.util.Locale;
import java.util.Scanner;

public class par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros você vai digitar?");
        int[] n = new int[sc.nextInt()];
        int[] pares = new int[sc.nextInt()];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Numeros pares: ");
            if(i % 2 == 0) {
                i = pares[i];
                System.out.println();
            }
        }


    }
}
