
public class ValorHandle extends AbstractHandler {

    @Override
    public void handleRequest(double valor, String localizacao, String historico) {
        if (canHandle(valor)) {
            System.out.println("ValorHandle processou a requisição: ");
            nextHandler.handleRequest(valor, localizacao, historico);
        } else {
            System.out.println("ValorHandle: Transação suspeita devido ao valor elevado: " + valor);
            System.out.println("Valor: " + valor);
            System.out.println("Localizacao: " + localizacao);
            System.out.println("Historico: " + historico);
        }
    }

    private boolean canHandle(double valor) {
        return valor <= 1000;
    }

}
