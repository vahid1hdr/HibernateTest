package net.javaguides.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by v.heydari on
 * 8/22/2020 4:43 PM
 */

public class TestConnection {
    public static void main(String[] args) {

//        String url = "jdbc:mysql://127.0.0.1:3306";
//        String username = "root";
//        String password = "Vahid@123";

        String url = "jdbc:mysql://sql12.freemysqlhosting.net:3306";
        String username = "sql12364693";
        String password = "saD8X11lgp";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("connection successful...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
