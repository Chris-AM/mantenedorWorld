
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CountryLanguageDao {
    
    public List<CountryLanguage> selectCountryLanguage(){
        
        List<CountryLanguage> countryLanguageList = new ArrayList<>();
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String query = "select * from countryLanguage order by CountryCode";
        
         try {
            connection = MyConnection.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                CountryLanguage countryLanguage = new CountryLanguage();
                countryLanguage.setCountryCode(resultSet.getString(1));
                countryLanguage.setLanguage(resultSet.getString(2));
                countryLanguage.setIsOfficial(resultSet.getString(3));
                countryLanguage.setPercentage(resultSet.getFloat(4));
                countryLanguageList.add(countryLanguage);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Connection error" + e.getStackTrace());
        }
        return countryLanguageList;
    }
    
     public List<CountryLanguage> selectCountryLanguageByCC(CountryLanguage countryLanguage){
        
        List<CountryLanguage> getCountryLanguages = new ArrayList<>();
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String query = "select * from countryLanguage where CountryCode = '" 
                        + countryLanguage.getCountryCode() + "'"
                        + "and Language = '" + countryLanguage.getLanguage()
                        + "'";
        
         try {
            connection = MyConnection.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                countryLanguage.setCountryCode(resultSet.getString(1));
                countryLanguage.setLanguage(resultSet.getString(2));
                countryLanguage.setIsOfficial(resultSet.getString(3));
                countryLanguage.setPercentage(resultSet.getFloat(4));
                getCountryLanguages.add(countryLanguage);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Connection error" + e.getStackTrace());
        }
        return getCountryLanguages;
    }


}
