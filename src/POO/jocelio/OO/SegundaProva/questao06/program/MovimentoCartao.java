package POO.jocelio.OO.SegundaProva.questao06.program;

import POO.jocelio.OO.SegundaProva.questao06.entities.CartaoEspecial;

public class MovimentoCartao {
    public static void main(String[] args) {
        CartaoEspecial c1 = new CartaoEspecial(1, "Joao", 500f, 50f);

        System.out.println("Dados iniciais");
        c1.mostrarDados();

        System.out.println("\nComprar R$ 50");
        c1.comprar(50);
        c1.mostrarDados();

        System.out.println("\nComprar R$ 49");
        c1.comprar(49);
        c1.mostrarDados();

        System.out.println("\nComprar R$ 450");
        c1.comprar(450);
        c1.mostrarDados();

        System.out.println("\nComprar R$ 50");
        c1.comprar(50);
        c1.mostrarDados();

        System.out.println("\nPagar R$ 50");
        c1.pagar(50);
        c1.mostrarDados();

        System.out.println("\nComprar R$ 50");
        c1.comprar(50);
        c1.mostrarDados();

        System.out.println("\nPagar tudo");
        c1.pagarTudo();
        c1.mostrarDados();
    }

}
