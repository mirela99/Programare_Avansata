package com.company;

import java.sql.*;
import java.sql.SQLException;
public class ArtistController implements Artist{

    public void create(String name, String country) {
        Connection connection = Database.getConnection();
        String sql = "insert into artists values (DEFAULT, '" + name + "','" + country + "')";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void findByName(String name) {
        Connection connection = Database.getConnection();
        String sql = "select * from artists where name=\" "+name+"\";";
        try {
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                String resultName = result.getString(2);
                String resultCountry = result.getString(3);
                System.out.println("Artistul cautat: "+resultName+" din tara : "+resultCountry);
            }

        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
