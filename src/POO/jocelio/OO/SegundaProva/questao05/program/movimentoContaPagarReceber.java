package POO.jocelio.OO.SegundaProva.questao05.program;

import POO.jocelio.OO.SegundaProva.questao05.entities.ContaPagar;
import POO.jocelio.OO.SegundaProva.questao05.entities.ContaReceber;

public class movimentoContaPagarReceber {
    public static void main(String[] args) {
        ContaReceber conta1 = new ContaReceber(1, "Supermercado Total", 500);
        ContaPagar conta2 = new ContaPagar(2, "Distribuidor Ideal", 400);

        System.out.println("=== Dados Iniciais ===");
        conta1.mostrarDados();
        System.out.println();
        conta2.mostrarDados();
        System.out.println();

        conta1.vender(600);
        conta2.comprar(400);
        System.out.println("=== Após Venda R$ 600 e Compra R$ 400 ===");
        conta1.mostrarDados();
        System.out.println();
        conta2.mostrarDados();
        System.out.println();

        conta1.receber(100);
        conta2.pagar(300);
        System.out.println("=== Após Receber R$ 100 e Pagar R$ 300 ===");
        conta1.mostrarDados();
        System.out.println();
        conta2.mostrarDados();
        System.out.println();

        conta1.receber(1500);
        conta2.pagar(600);
        System.out.println("=== Após Receber R$ 1500 e Pagar R$ 600 ===");
        conta1.mostrarDados();
        System.out.println();
        conta2.mostrarDados();
        System.out.println();

        float saldoReceber = conta1.getSaldo();
        float saldoPagar = Math.abs(conta2.getSaldo());
        float situacaoEmpresa = saldoReceber - saldoPagar;

        System.out.println("=== SITUAÇÃO ATUAL DA EMPRESA ===");
        System.out.println("Saldo a Receber: R$ " + saldoReceber);
        System.out.println("Saldo a Pagar: R$ " + saldoPagar);
        System.out.println("Saldo da Empresa (A Receber - A Pagar): R$ " + situacaoEmpresa);
    }

}
