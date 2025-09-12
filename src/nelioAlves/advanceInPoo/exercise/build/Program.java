package nelioAlves.advanceInPoo.exercise.build;

import nelioAlves.advanceInPoo.exercise.entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder:");
        String number = sc.nextLine();

        System.out.println("Is there na initial deposit: (y/n)");
        char respose = sc.next().charAt(0);

        if (respose == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDepositValue = sc.nextDouble();
            account = new Account(accountNumber, number, initialDepositValue);
        }else {
            account = new Account(accountNumber, number);
        }

        System.out.println("Account data:");



        sc.close();
    }
}
