package POO.jocelio.OO.revisao.Polimorfismo.questao03.program;

import POO.jocelio.OO.revisao.Polimorfismo.questao03.entities.ProdutoCustoAtual;
import POO.jocelio.OO.revisao.Polimorfismo.questao03.entities.ProdutoCustoMedio;

public class MovimentoEstoque {
        public static void main(String[] args) {

            // Criação dos produtos
            ProdutoCustoAtual feijao = new ProdutoCustoAtual(1, "Feijão", 60, 1.50f);
            ProdutoCustoMedio tomate = new ProdutoCustoMedio(2, "Tomate", 120, 2.50f);

            System.out.println("=== Situação Inicial ===");
            exibirDados(feijao);
            exibirDados(tomate);

            // Reposição
            feijao.repor(100, 1.60f);
            tomate.repor(100, 2.60f);

            System.out.println("\n=== Após Reposição ===");
            exibirDados(feijao);
            exibirDados(tomate);

            // Baixas normais
            feijao.baixar(30);
            tomate.baixar(50);

            System.out.println("\n=== Após Baixas ===");
            exibirDados(feijao);
            exibirDados(tomate);

            // Baixa exagerada (para testar saldo insuficiente)
            tomate.baixar(300);

            System.out.println("\n=== Após Baixa Excedente ===");
            exibirDados(tomate);
        }

        private static void exibirDados(Object produto) {
            if (produto instanceof ProdutoCustoAtual) {
                ProdutoCustoAtual p = (ProdutoCustoAtual) produto;
                System.out.printf("Código: %d | Nome: %s | Quantidade: %.2f | Custo: R$ %.2f | Valor Estoque: R$ %.2f%n",
                        p.getCodigo(), p.getNome(), p.getQuantidade(), p.getCusto(), p.getValorEstoque());
            } else if (produto instanceof ProdutoCustoMedio) {
                ProdutoCustoMedio p = (ProdutoCustoMedio) produto;
                System.out.printf("Código: %d | Nome: %s | Quantidade: %.2f | Custo: R$ %.2f | Valor Estoque: R$ %.2f%n",
                        p.getCodigo(), p.getNome(), p.getQuantidade(), p.getCusto(), p.getValorEstoque());
            }
        }

    }

