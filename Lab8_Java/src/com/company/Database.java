package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database dba ;
    private static Connection connection = null;
    static final String USER = "dba";
    static final String PASW = "08071999Mirela!";

    public Database() {
        dba = new Database();
    }
    public Database getDatabase() {
        if (dba == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicAlbums", USER, PASW);
            }
            catch (SQLException e) {
               e.printStackTrace();
            }
        }
        return dba;
    }
    public static Connection getConnection() {

        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3360/MusicAlbums", USER, PASW );
            } catch (SQLException e) {
               e.printStackTrace();
            }
        }
        return connection;
    }
    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

