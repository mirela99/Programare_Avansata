package app;

import entity.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import repo.*;
public class AlbumManager {

    public static void main(String[] args) {

        Albums album = new Albums(999, "HelloSummer");
        AlbumRepository a = new AlbumRepository();
        a.create(album);

        Artists artist = new Artists(999, "Thanananaaaaaa");
        ArtistRepository b = new ArtistRepository();
        b.create(artist);
    }
}
