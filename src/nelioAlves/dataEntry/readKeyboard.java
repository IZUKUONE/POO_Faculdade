package nelioAlves.dataEntry;

import java.util.Locale;
import java.util.Scanner;

public class readKeyboard {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;

        x = sc.next();
        System.out.println("Você digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Voce digitou: " + y);

        double z;
        z = sc.nextDouble();
        System.out.println("Voce digitou: " + z);
        sc.close();
/*--------------------------------------------------------------------------------*/
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
