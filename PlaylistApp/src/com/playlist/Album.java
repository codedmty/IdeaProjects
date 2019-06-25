package com.playlist;

import java.util.ArrayList;

public class Album {
    private String albumTitle;
    ArrayList<Song> songs;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        songs = new ArrayList<>();
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void addSong(String trackName, double duration) {
        Song tempSong = new Song(trackName,duration);
       songs.add(tempSong);
    }

    public void printTrackList() {
        for(int i = 0; i < songs.size(); i++) {
            System.out.println((i+1) + " - " + songs.get(i).getTitle());
        }
    }

}



