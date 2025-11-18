public class CalculoConservador implements Strategy {

    @Override
    public double calcular(double valorAcoes, double valorFundos, double valorRendaFixa) {
        return (valorAcoes * 0.2) + (valorFundos * 0.3) + (valorRendaFixa * 0.5);
    }

}
