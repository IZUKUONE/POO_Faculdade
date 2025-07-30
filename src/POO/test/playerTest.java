package POO.test;

import POO.Association.player;

public class playerTest {
    public static void main(String[] args) {
        player p1 = new player("neymar");
        player p2 = new player("pele");
        player p3 = new player("juan");

        player[] players = {p1, p2, p3};

        for (player p : players) {
            p.imprime();
        }

    }
}
