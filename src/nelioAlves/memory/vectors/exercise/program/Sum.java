package nelioAlves.memory.vectors.exercise.program;

import java.util.Locale;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type?");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter a number:");
            vector[i] = sc.nextDouble();

        }
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        System.out.println("Sum: " + sum);

        double average = sum / n;
        System.out.println("Average: " + average);

    }
}
