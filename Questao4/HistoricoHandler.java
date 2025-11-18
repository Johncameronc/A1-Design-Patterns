
public class HistoricoHandler extends AbstractHandler {

    @Override
    public void handleRequest(double valor, String localizacao, String historico) {
        if (canHandle(valor, localizacao, historico)) {
            System.out.println("HistóricoHandler processou a requisição: ");
        } else {
            System.err.println("Solicitação rejeitada devido ao histórico suspeito: " + historico);
        }

        System.out.println("Valor: " + valor);
        System.out.println("Localizacao: " + localizacao);
        System.out.println("Historico: " + historico);
    }

    private boolean canHandle(double valor, String localizacao, String historico) {
        return historico.equals("Limpo");
    }

}
