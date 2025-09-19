package nelioAlves.memory.vectors.exercise.program;

import nelioAlves.memory.vectors.exercise.entities.Person;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be typed?");
        int[] people = new int[sc.nextInt()];

        String name = "";
        int age = 0;
        double height = 0;

        for (int i = 0; i < people.length; i++) {
            System.out.println("1st person's details:");

            System.out.println("Name:");


            System.out.println("Age:");
            age = sc.nextInt();

            System.out.println("Height:");
            height = sc.nextInt();
            Person person = new Person(name, age, height);
        }


    }
}
