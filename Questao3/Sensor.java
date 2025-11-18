import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private String tipo;
    private double valor;
    private List<Observer> observers = new ArrayList<>();

    public Sensor(String tipo) {
        this.tipo = tipo;
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void setValor(double valor) {
        this.valor = valor;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.atualizar(tipo, valor);
        }
    }

}
