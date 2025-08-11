package nelioAlves.exercise1;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int difernca;

        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        difernca = (A*B-C*D);
        System.out.println(difernca);
    }
}
