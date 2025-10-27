package POO.jocelio.OO.revisao.Polimorfismo.questao02.program;

import POO.jocelio.OO.revisao.Polimorfismo.questao02.entities.CartaoEspecial;

public class MovimentoCartao {
    public static void main(String[] args) {
        System.out.println("===== MOVIMENTO DO CARTÃO =====\n");


        CartaoEspecial cartao = new CartaoEspecial("1", "Joao", 500.00, 50.00);
        cartao.mostrarDados();

        System.out.println("Compra 1: R$ 50,00");
        cartao.comprar(50.00);
        cartao.mostrarDados();

        System.out.println("Compra 2: R$ 49,00");
        cartao.comprar(49.00);
        cartao.mostrarDados();

        System.out.println("Compra 3: R$ 450,00");
        cartao.comprar(450.00);
        cartao.mostrarDados();

        System.out.println("Compra 4: R$ 50,00");
        cartao.comprar(50.00);
        cartao.mostrarDados();

        System.out.println("Pagamento: R$ 50,00");
        cartao.pagar(50.00);
        cartao.mostrarDados();

        System.out.println("Compra 5: R$ 50,00");
        cartao.comprar(50.00);
        cartao.mostrarDados();

        System.out.println("Pagando todo o saldo devedor");
        cartao.pagarTudo();
        cartao.mostrarDados();
    }
}
