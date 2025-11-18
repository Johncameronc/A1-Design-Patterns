
public class FabricaRelatorioEmergencial extends FabricaRelatorio {
    
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }

}
