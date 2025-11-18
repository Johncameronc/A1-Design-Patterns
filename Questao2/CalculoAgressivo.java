public class CalculoAgressivo implements Strategy {

    @Override
    public double calcular(double valorAcoes, double valorFundos, double valorRendaFixa) {
        return (valorAcoes * 0.8) + (valorFundos * 0.15) + (valorRendaFixa * 0.05);
    }

}
