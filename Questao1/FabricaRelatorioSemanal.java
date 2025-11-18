
public class FabricaRelatorioSemanal extends FabricaRelatorio {
    
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioSemanal();
    }

}
