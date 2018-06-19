public interface Observed  { //наблюдаемый
    void addObserver(Observer o);  //добавить наблюдателя
    void removeObserver(Observer o);  //удалить наблюдателя
    void notifyObserver();  // уведомить наблюдателей об изменениях
}
