
import java.util.List;


public class ServicoRelatorio {

    public void criarRelatorio(FabricaRelatorio fabrica, String titulo, List<Double> dados) {
        Relatorio relatorio = fabrica.criarRelatorio();
        relatorio.gerarRelatorio(titulo, dados);
    }

}
