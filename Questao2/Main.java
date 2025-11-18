public class Main {

    public static void main(String[] args) {

        double valorAcoes = 10000.0;
        double valorFundos = 5000.0;
        double valorRendaFixa = 2000.0;

        Calculadora calculadoraRisco = new Calculadora(new CalculoConservador());
        System.out.println("Calculo conservador: " + calculadoraRisco.calcularRisco(valorAcoes, valorFundos, valorRendaFixa));

        calculadoraRisco.setStrategy(new CalculoModerado());
        System.out.println("Calculo moderado: " + calculadoraRisco.calcularRisco(valorAcoes, valorFundos, valorRendaFixa));

        calculadoraRisco.setStrategy(new CalculoAgressivo());
        System.out.println("Calculo agressivo: " + calculadoraRisco.calcularRisco(valorAcoes, valorFundos, valorRendaFixa));

    }

}
