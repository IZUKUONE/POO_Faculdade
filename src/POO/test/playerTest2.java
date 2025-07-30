package POO.test;

import POO.Association.player;
import POO.Association.time;

public class playerTest2 {
    public static void main(String[] args) {
        player p = new player("pelé");
        time t1 = new time("Vasco");

        p.setTime(t1);
        p.imprime();
    }
}
