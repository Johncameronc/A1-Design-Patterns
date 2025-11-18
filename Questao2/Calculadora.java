public class Calculadora {

    private Strategy strategy;

    public Calculadora(Strategy strategy) {
        this.setStrategy(strategy);
    }

    public double calcularRisco(double valorAcoes, double valorFundos, double valorRendaFixa) {
        return this.strategy.calcular(valorAcoes, valorFundos, valorRendaFixa);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
