package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CountryDao {

    public List<Country> selectCountry() {

        List<Country> countryList = new ArrayList<Country>();
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String query = "select * from country order by Code";
        
        try {
            connection = MyConnection.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                Country country = new Country();
                country.setCode(resultSet.getString(1));
                country.setName(resultSet.getString(2));
                country.setContinent(resultSet.getString(3));
                country.setRegion(resultSet.getString(4));
                country.setSurfaceArea(resultSet.getFloat(5));
                country.setIndepYear(resultSet.getInt(6));
                country.setPopulation(resultSet.getInt(7));
                country.setLifeExpectancy(resultSet.getFloat(8));
                country.setGpn(resultSet.getFloat(9));
                country.setGpnOld(resultSet.getFloat(10));
                country.setLocalName(resultSet.getString(11));
                country.setGovernmentForm(resultSet.getString(12));
                country.setHeadOfState(resultSet.getString(13));
                country.setCapital(resultSet.getInt(14));
                country.setCode2(resultSet.getString(15));
                countryList.add(country);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Connection error" + e.getStackTrace());
        }
        return countryList; 
    }
    
    public List<Country> selectCountryByCode(Country country){
        List<Country> getCountry = new ArrayList<Country>();
        
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String query = "select * from country where code = '" + country.getCode() + "'";
        System.out.println(query);
        try {
            connection = MyConnection.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                country.setCode(resultSet.getString(1));
                country.setName(resultSet.getString(2));
                country.setContinent(resultSet.getString(3));
                country.setRegion(resultSet.getString(4));
                country.setSurfaceArea(resultSet.getFloat(5));
                country.setIndepYear(resultSet.getInt(6));
                country.setPopulation(resultSet.getInt(7));
                country.setLifeExpectancy(resultSet.getFloat(8));
                country.setGpn(resultSet.getFloat(9));
                country.setGpnOld(resultSet.getFloat(10));
                country.setLocalName(resultSet.getString(11));
                country.setGovernmentForm(resultSet.getString(12));
                country.setHeadOfState(resultSet.getString(13));
                country.setCapital(resultSet.getInt(14));
                country.setCode2(resultSet.getString(15));
                getCountry.add(country);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Connection error" + e.getStackTrace());
        }
        return getCountry;
    }
    
    public boolean insertCountry(Country country){
        
        boolean insert = false;
         Statement statement = null;
        Connection connection = null;

        String query = "insert into country values ('" + 
                country.getCode()  + "','" +
                country.getName() + "','" +
                country.getContinent() + "','" +
                country.getRegion() + "'," +
                country.getSurfaceArea() + "," +
                country.getIndepYear() + "," +
                country.getPopulation() + "," +
                country.getLifeExpectancy() + "," +
                country.getGpn() + "," +
                country.getGpnOld() + ",'" +
                country.getLocalName() + "','" +
                country.getGovernmentForm() + "','" +
                country.getHeadOfState() + "'," +
                country.getCapital() + ",'" +
                country.getCode2() + "')";

        System.out.println(query);

        try {

            connection = MyConnection.connect();
            statement = connection.createStatement();
            statement.execute(query);
            insert = true;
            statement.close();
            connection.close();

        } catch (SQLException sqlE) {
            System.out.println("Connection Error " + sqlE.getStackTrace());
        }
        return insert;
    }
    
      public boolean deleteCountry(Country country) {

        boolean delete = false;
        Statement statement = null;
        Connection connection = null;

        String query = "delete from country where code= '" + country.getCode() + "'";

        System.out.println(query);

        try {
            connection = MyConnection.connect();
            statement = connection.createStatement();
            statement.execute(query);
            delete = true;
            statement.close();
            connection.close();

        } catch (SQLException sqlE) {
            System.out.println("Connection Error " + sqlE.getStackTrace());
        }

        return delete;
    }
      
      public boolean updateCountry(Country country){
        
        boolean update = false;
         Statement statement = null;
        Connection connection = null;

        String query = "update country set name ='" + 
                country.getName() + "', Continent ='" +
                country.getContinent() + "', Region ='" +
                country.getRegion() + "', SurfaceArea =" +
                country.getSurfaceArea() + ", IndepYear =" +
                country.getIndepYear() + ", Population =" +
                country.getPopulation() + ", LifeExpectancy =" +
                country.getLifeExpectancy() + ", GNP =" +
                country.getGpn() + ", GNPOld =" +
                country.getGpnOld() + ", LocalName ='" +
                country.getLocalName() + "', GovernmentForm ='" +
                country.getGovernmentForm() + "', HeadOfState ='" +
                country.getHeadOfState() + "', Capital =" +
                country.getCapital() + ", Code2 ='" +
                country.getCode2() + "' where code = '" +
                country.getCode() + "'";

        System.out.println(query);

        try {
            connection = MyConnection.connect();
            statement = connection.createStatement();
            statement.execute(query);
            update = true;
            statement.close();
            connection.close();
        } catch (SQLException sqlE) {
            System.out.println("Connection Error " + sqlE.getStackTrace());
        }
        return update;
    }
}
