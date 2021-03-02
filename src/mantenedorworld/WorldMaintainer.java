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

        //CountryDao countryDao = new CountryDao();
        //CountryLanguageDao countryLanguageDao = new CountryLanguageDao();
        //CountryLanguage countryLanguage = new CountryLanguage();
        
        
        //countryLanguage.setCountryCode("ABW");
        //countryLanguage.setLanguage("English");
        
        //for (CountryLanguage coutry: countryLanguageDao.selectCountryLanguageByCC(countryLanguage)){
          //  System.out.println(coutry.getLanguage() +  ", " + coutry.getCountryCode() + ", " + coutry.getPercentage());
        //}
        
        //CountryLanguage countryLanguage = new CountryLanguage("CHL", "English", "F", (float) 10.4);
        //countryLanguageDao.insertCountryLanguage(countryLanguage);
    }

}
