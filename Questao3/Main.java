public class Main {

    public static void main(String[] args) {

        Sensor sensorTemperatura = new Sensor("Temperatura");
        Sensor sensorUmidade = new Sensor("Umidade");
        Sensor sensorPoluicao = new Sensor("Poluição");

        Observer painelControle = new PainelControle();
        Observer moduloAlerta = new ModuloAlerta();
        Observer moduloHistorico = new ModuloHistorico();

        sensorTemperatura.attach(painelControle);
        sensorTemperatura.attach(moduloAlerta);

        sensorUmidade.attach(painelControle);
        sensorUmidade.attach(moduloHistorico);

        sensorPoluicao.attach(painelControle);
        sensorPoluicao.attach(moduloAlerta);
        sensorPoluicao.attach(moduloHistorico);

        sensorTemperatura.setValor(25.5);
        sensorUmidade.setValor(60.0);
        sensorPoluicao.setValor(120.0);

    }

}
