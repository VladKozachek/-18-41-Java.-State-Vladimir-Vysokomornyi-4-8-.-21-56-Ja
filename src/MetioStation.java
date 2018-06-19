import java.util.ArrayList;
import java.util.List;

public class MetioStation implements Observed { //ConcreteObserved
    private int temperature;
    private int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setData(int temperature,int pressure) {  //задаем температуру и давление
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObserver();    //вызываем метод для уведомления наблюдателей
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {     //метод для уведомления наблюдателей
         for (Observer item: observers){
             item.handleEvent(temperature,pressure);
         }
    }
}
