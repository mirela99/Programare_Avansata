package com.company;

public class Main {

    public static void main(String[] args) {
            ArtistController artist = new ArtistController();
            artist.create("Gerd Aretz", "Germania");
            artist.create("Hillary Duff", "USA");
            artist.create("Aguillera", "Austria");
            artist.create("Camy", "UK");

            AlbumController album = new AlbumController();
            album.create("jaz", 1, 1998);
            album.create("Flowers", 6, 2006);
            album.create("new", 2, 2020);
            album.create("jabla", 3, 2019);

            artist.findByName("Aguillera");
            album.findByArtist(2);
            Database.closeConnection();

    }
}
