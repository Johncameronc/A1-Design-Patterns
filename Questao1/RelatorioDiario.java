
import java.util.List;

public class RelatorioDiario implements Relatorio {

    @Override
    public void gerarRelatorio(String titulo, List<Double> dados) {
        System.out.println("Relatório Diário:");
        System.out.println("Título: " + titulo);

        for (Double dado : dados) {
            System.out.println("Dado: " + dado);
        }

        System.out.println("");
    }

}
