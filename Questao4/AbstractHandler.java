
public abstract class AbstractHandler {

    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(double valor, String localizacao, String historico);

    private boolean canHandle(double valor, String localizacao, String historico) {
        // Default implementation, can be overridden by subclasses
        return false;
    }

}
