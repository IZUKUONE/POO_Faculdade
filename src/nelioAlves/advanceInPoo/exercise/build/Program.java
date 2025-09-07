package nelioAlves.advanceInPoo.exercise.build;

import nelioAlves.advanceInPoo.exercise.entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder:");
        String number = sc.nextLine();

        System.out.println("Is there na initial deposit: (y/n)");
        String deposit = sc.nextLine();
        if (Objects.equals(deposit, "y")) {
            System.out.println("Enter initial deposit value:");
            double depositValue = sc.nextDouble();

            Account account = new Account(accountNumber, number, depositValue);
            System.out.println("Account data:");
        }
        Account account = new Account(accountNumber, number);

        System.out.println("Account data:");
        ;


        sc.close();
    }
}
