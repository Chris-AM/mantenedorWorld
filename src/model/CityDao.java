package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityDao {

    public boolean insertCity(City city) {

        boolean insert = false;
        Statement statement = null;
        Connection connection = null;

        String query = "insert into city values (null, '" + city.getName()
                + "','" + city.getCountryCode()
                + "','" + city.getDistrict()
                + "', " + city.getPopulation()
                + ")";

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

    //select
    public List<City> selectCity() {

        List<City> listCity = new ArrayList<City>();
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String query = "select * from city order by id";

        try {
            connection = MyConnection.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                City city = new City();
                city.setID(resultSet.getInt(1));
                city.setName(resultSet.getString(2));
                city.setCountryCode(resultSet.getString(3));
                city.setDistrict(resultSet.getString(4));
                city.setPopulation(resultSet.getInt(5));
                listCity.add(city);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException sqlException) {
            System.out.println("Error de conexión" + sqlException.getStackTrace());
        }

        return listCity;
    }
    
    public List<City> selectCityByID(City city) {

        List<City> getCity = new ArrayList<City>();
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        String query = "select * from city where id =" + city.getID();
        System.out.println(query);

        try {
            connection = MyConnection.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                city.setID(resultSet.getInt(1));
                city.setName(resultSet.getString(2));
                city.setCountryCode(resultSet.getString(3));
                city.setDistrict(resultSet.getString(4));
                city.setPopulation(resultSet.getInt(5));
                getCity.add(city);
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException sqlException) {
            System.out.println("Error de conexión" + sqlException.getStackTrace());
        }

        return getCity;
    }
    

    public boolean deleteCity(City city) {

        boolean delete = false;
        Statement statement = null;
        Connection connection = null;

        String query = "delete from city where id=" + city.getID();

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

    public boolean updateCity(City city) {

        boolean update = false;
        Statement statement = null;
        Connection connection = null;

        String query = "update city set name ='"
                + city.getName() + "', countryCode ='"
                + city.getCountryCode() + "', district = '"
                + city.getDistrict() + "', population = "
                + city.getPopulation() + " where id = "
                + city.getID();

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
