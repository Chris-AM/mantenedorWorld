
package controllers;

import model.City;
import model.CityDao;
public class CityController {
    
    public boolean registerCity(City city){
        
        boolean register = false;
        
        CityDao cityDao = new CityDao();
        register = cityDao.insertCity(city);
        
        return register;
    }
}
