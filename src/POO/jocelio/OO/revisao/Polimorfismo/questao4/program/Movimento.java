package POO.jocelio.OO.revisao.Polimorfismo.questao4.program;

import POO.jocelio.OO.revisao.Polimorfismo.questao4.entities.Paciente;
import POO.jocelio.OO.revisao.Polimorfismo.questao4.entities.PacienteConvenio;
import POO.jocelio.OO.revisao.Polimorfismo.questao4.entities.PacienteParticular;

public class Movimento {
    public static void main(String[] args) {
        // Criação dos pacientes
        PacienteParticular paciente1 = new PacienteParticular(1, "João", 0, 10);
        PacienteConvenio paciente2 = new PacienteConvenio(2, "Maria", 0, "FACAPE", 500);

        // Mostrar dados iniciais
        System.out.println("=== DADOS INICIAIS ===");
        System.out.println("Código: " + paciente1.getCodigo() + " | Nome: " + paciente1.getNome() + " | Débito: R$ " + paciente1.getDebito() + " | Desconto: " + paciente1.getDesconto() + "%");
        System.out.println("Código: " + paciente2.getCodigo() + " | Nome: " + paciente2.getNome() + " | Débito: R$ " + paciente2.getDebito() + " | Convênio: " + paciente2.getConvenio() + " | Limite: R$ " + paciente2.getLimite());

        // Usar serviços
        System.out.println("\n=== USO DE SERVIÇOS ===");
        System.out.println("João usa serviço de R$ 100");
        paciente1.usarServico(100);
        System.out.println("Maria usa serviço de R$ 200");
        paciente2.usarServico();

        System.out.println("João usa serviço de R$ 200");
        paciente1.usarServico(200);
        System.out.println("Maria usa serviço de R$ 301");
        paciente2.usarServico();

        // Pagamentos
        System.out.println("\n=== PAGAMENTOS ===");
        System.out.println("João paga R$ 300");
        paciente1.pagarServico(300);
        System.out.println("Maria paga R$ 150");
        paciente2.pagarServico(150);

        // Mostrar dados finais
        System.out.println("\n=== DADOS FINAIS ===");
        System.out.println("Código: " + paciente1.getCodigo() + " | Nome: " + paciente1.getNome() + " | Débito: R$ " + paciente1.getDebito() + " | Desconto: " + paciente1.getDesconto() + "%");
        System.out.println("Código: " + paciente2.getCodigo() + " | Nome: " + paciente2.getNome() + " | Débito: R$ " + paciente2.getDebito() + " | Convênio: " + paciente2.getConvenio() + " | Limite: R$ " + paciente2.getLimite());
    }
}
