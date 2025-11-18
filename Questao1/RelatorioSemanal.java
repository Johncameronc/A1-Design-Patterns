
import java.util.List;


public class RelatorioSemanal implements Relatorio {
    
    @Override
    public void gerarRelatorio(String titulo, List<Double> dados) {
        System.out.println("Relatório Semanal:");
        System.out.println("Título: " + titulo);
        double soma = 0;
        for (Double dado : dados) {
            soma += dado;
        }

        if (dados.size() == 7) {
            double media = dados.isEmpty() ? 0 : soma / dados.size();
            System.out.println("Média dos dados: " + media);
        } else {
            System.out.println("Número insuficiente de dados para calcular a média semanal.");
        }
        
        System.out.println("");

    }

}
