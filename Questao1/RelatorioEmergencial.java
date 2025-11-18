
import java.util.List;

public class RelatorioEmergencial implements Relatorio {

    @Override
    public void gerarRelatorio(String titulo, List<Double> dados) {
        System.out.println("Relatório Emergencial:");
        System.out.println("Título: " + titulo);
        if (!dados.isEmpty()) {
            Double max = dados.get(0);
            for (Double dado : dados) {
                if (dado > max) {
                    max = dado;
                }
            }
            System.out.println("Valor máximo dos dados: " + max);
        } else {
            System.out.println("Nenhum dado disponível para análise.");
        }

        System.out.println("");

    }

}
