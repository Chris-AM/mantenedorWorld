package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public static Connection connect() {

        Connection con = null;

        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3307/world?user=" + user + "&password" + password;

        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Connected");
            }
        } catch (SQLException sqlE) {
            System.out.println("Connecting Error" + sqlE.getStackTrace());
        }

        return con;
    }
}
