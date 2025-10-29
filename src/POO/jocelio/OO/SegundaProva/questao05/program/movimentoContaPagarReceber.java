package POO.jocelio.OO.SegundaProva.questao05.program;

import POO.jocelio.OO.SegundaProva.questao05.entities.ContaPagar;
import POO.jocelio.OO.SegundaProva.questao05.entities.ContaReceber;

public class movimentoContaPagarReceber {
    public static void main(String[] args) {
        ContaReceber conta1 = new ContaReceber(1, "mercado Total", 500);
        ContaPagar conta2 = new ContaPagar(2, "Distribuidor ideal", 400);

        conta1.vender(600);
        conta2.pagar(400);
        System.out.println("\n=== Após Venda e Compra ===");
        System.out.println("Conta a Receber: " + conta1.getCodigo() + " - " + conta1.getNome() + " - Saldo: " + conta1.getSaldo());
        System.out.println("Conta a Pagar: " + conta2.getCodigo() + " - " + conta2.getNome() + " - Saldo: " + conta2.getSaldo());

        conta1.vender(100);
        conta2.pagar(300);
        System.out.println("\n=== Após Receber e Pagar ===");
        System.out.println("Conta a Receber: " + conta1.getCodigo() + " - " + conta1.getNome() + " - Saldo: " + conta1.getSaldo());
        System.out.println("Conta a Pagar: " + conta2.getCodigo() + " - " + conta2.getNome() + " - Saldo: " + conta2.getSaldo());

        conta1.vender(1500);
        conta2.pagar(600);
        System.out.println("Conta a Receber: " + conta1.getCodigo() + " - " + conta1.getNome() + " - Saldo: " + conta1.getSaldo());
        System.out.println("Conta a Pagar: " + conta2.getCodigo() + " - " + conta2.getNome() + " - Saldo: " + conta2.getSaldo());}
}
