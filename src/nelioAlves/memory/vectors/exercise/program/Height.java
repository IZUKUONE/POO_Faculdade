package nelioAlves.memory.vectors.exercise.program;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be typed?");
        int[] people = new int[sc.nextInt()];

        for (int i = 0; i < people.length; i++) {
            System.out.println("1st person's details:");
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Age:");
            int age = sc.nextInt();
            System.out.println("Height:");
            double height = sc.nextInt();

        }
    }
}
