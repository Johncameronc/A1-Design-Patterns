
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ServicoRelatorio servico = new ServicoRelatorio();

        FabricaRelatorio fabricaDiario = new FabricaRelatorioDiario();
        servico.criarRelatorio(fabricaDiario, "Relatório Diário de Vendas", List.of(10500.0, 12300.5, 9800.75, 999.90, 5697.99, 9100.00, 3003.50));

        FabricaRelatorio fabricaSemanal = new FabricaRelatorioSemanal();
        servico.criarRelatorio(fabricaSemanal, "Relatório Semanal de Vendas", List.of(10500.0, 12300.5, 9800.75, 999.90, 5697.99, 9100.00, 3003.50));

        FabricaRelatorio fabricaEmergencial = new FabricaRelatorioEmergencial();
        servico.criarRelatorio(fabricaEmergencial, "Relatório Emergencial de Vendas", List.of(10500.0, 12300.5, 9800.75, 999.90, 5697.99, 9100.00, 3003.50));

    }
}
