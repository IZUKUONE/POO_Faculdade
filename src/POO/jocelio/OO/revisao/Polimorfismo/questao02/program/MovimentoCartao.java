package POO.jocelio.OO.revisao.Polimorfismo.questao02.program;

import POO.jocelio.OO.revisao.Polimorfismo.questao02.entities.CartaoEspecial;

public class MovimentoCartao {
    public static void main(String[] args) {
        System.out.println("===== MOVIMENTO DO CARTÃO =====\n");

        // Criando cartão: número 1, titular Joao, limite R$ 500, compra mínima R$ 50
        CartaoEspecial cartao = new CartaoEspecial("1", "Joao", 500.00, 50.00);
        cartao.mostrarDados();

        // Compra 1: R$ 50
        System.out.println(">>> Compra 1: R$ 50,00");
        cartao.comprar(50.00);
        cartao.mostrarDados();

        // Compra 2: R$ 49 (deve ser rejeitada - menor que o mínimo)
        System.out.println(">>> Compra 2: R$ 49,00");
        cartao.comprar(49.00);
        cartao.mostrarDados();

        // Compra 3: R$ 450
        System.out.println(">>> Compra 3: R$ 450,00");
        cartao.comprar(450.00);
        cartao.mostrarDados();

        // Compra 4: R$ 50 (deve ser rejeitada - excede o limite)
        System.out.println(">>> Compra 4: R$ 50,00");
        cartao.comprar(50.00);
        cartao.mostrarDados();

        // Pagamento: R$ 50
        System.out.println(">>> Pagamento: R$ 50,00");
        cartao.pagar(50.00);
        cartao.mostrarDados();

        // Compra 5: R$ 50
        System.out.println(">>> Compra 5: R$ 50,00");
        cartao.comprar(50.00);
        cartao.mostrarDados();

        // Pagar tudo
        System.out.println(">>> Pagando todo o saldo devedor");
        cartao.pagarTudo();
        cartao.mostrarDados();
    }
}
