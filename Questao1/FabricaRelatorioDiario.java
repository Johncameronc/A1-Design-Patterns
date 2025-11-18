
public class FabricaRelatorioDiario extends FabricaRelatorio {
    
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }

}
