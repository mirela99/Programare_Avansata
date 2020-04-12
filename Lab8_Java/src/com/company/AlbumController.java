package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlbumController implements Album {

    public void create(String name, int artistId, int releaseYear) {
        Connection connection=Database.getConnection();
        String sql ="insert into albums values (DEFAULT,'"+name+"','"+artistId+"','"+releaseYear+"');";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void findByArtist(int artistId){
            Connection connection=Database.getConnection();
            String sql ="select * from albums where artist_id="+artistId+";";
        try {
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                String resultName = result.getString(2);
                int resultReleaseYear = result.getInt(4);
                System.out.println("Albumul cautat : "+resultName+" din anul : "+resultReleaseYear);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
