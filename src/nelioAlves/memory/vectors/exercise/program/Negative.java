package nelioAlves.memory.vectors.exercise.program;

import java.util.Locale;
import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        if (n > 10){
            System.out.println("Error, numero max é 10");
        } else {

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                System.out.println(numbers[i]);

                }

            }

        }

    }

}
