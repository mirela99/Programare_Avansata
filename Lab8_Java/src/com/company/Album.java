package com.company;

public interface Album {
    public void create(String name, int artistId, int releaseYear);
    public void findByArtist(int artistId);
}
