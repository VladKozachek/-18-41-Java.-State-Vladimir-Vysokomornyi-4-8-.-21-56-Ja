public class Main {
    public static void main(String[] args) {
        MetioStation station=new MetioStation();  //Создаем наблюдаемого
        station.addObserver(new ConsoleObserver() ); //добавляем наблюдателя
        station.addObserver(new FileObserver());
        station.setData(20,700);
        station.setData(24,800);
        station.setData(26,900);

    }
}
