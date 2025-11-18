
public class ModuloHistorico implements Observer {

    @Override
    public void atualizar(String tipo, double valor) {
        System.out.println("Módulo Histórico: " + tipo + " atualizado para " + valor);
    }

}
