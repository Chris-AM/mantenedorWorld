package mantenedorworld;

import model.City;
import model.CityDao;
import model.Country;
import model.CountryDao;
import model.CountryLanguage;
import model.CountryLanguageDao;
import model.MyConnection;
import view.MainWindow;

public class WorldMaintainer {

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }

}
