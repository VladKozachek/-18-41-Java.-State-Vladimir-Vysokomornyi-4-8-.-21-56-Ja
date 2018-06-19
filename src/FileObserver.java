import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static java.io.File.createTempFile;

public class FileObserver implements Observer{  ////наблюдатель сохраняет изменения в файл

    @Override
    public void handleEvent(int temperature, int pressure) {
        try {
            File file=createTempFile("meteostation",".txt");
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print("Погода изменилась! Температура - " + temperature+" Давление - "+pressure);
            printWriter.println();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
