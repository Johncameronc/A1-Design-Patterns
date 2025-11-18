
public class Chain {

    private AbstractHandler chain;

    private Chain() {
        inicialiarChain();
    }

    public static Chain getInstance() {
        return new Chain();
    }

    private void inicialiarChain() {
        AbstractHandler valorHandler = new ValorHandle();
        AbstractHandler localizacaoHandler = new LocalizacaoHandler();
        AbstractHandler historicoHandler = new HistoricoHandler();

        valorHandler.setNextHandler(localizacaoHandler);
        localizacaoHandler.setNextHandler(historicoHandler);

        this.chain = valorHandler;
    }

    public void solicitarVerificacao(double valor, String localizacao, String historico) {
        this.chain.handleRequest(valor, localizacao, historico);
    }

}
