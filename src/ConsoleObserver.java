public class ConsoleObserver implements Observer {  //наблюдатель вывыводит изменения в консоль
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Погода изменилась! Температура - " + temperature+" Давление - "+pressure);
    }
}
