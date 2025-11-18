public class CalculoModerado implements Strategy {

    @Override
    public double calcular(double valorAcoes, double valorFundos, double valorRendaFixa) {
        return (valorAcoes * 0.5) + (valorFundos * 0.3) + (valorRendaFixa * 0.2);
    }

}
