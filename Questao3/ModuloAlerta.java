
public class ModuloAlerta implements Observer {

    @Override
    public void atualizar(String tipo, double valor) {
        System.out.println("Painel de Controle: " + tipo + " atualizou para " + valor);
    }

}
