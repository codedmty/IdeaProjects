package com.eddie;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    public SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addSong(String trackName, double duration) {
        return this.songList.addSong(trackName, duration);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songList.songs.size())) {
            playList.add(this.songList.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(String title, double duration) {
            if(findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for(Song checkedSong: this.songs) { // THIS IS ANOTHER WAY TO CYCLE THROUGH A LIST TO CHECK!!!!
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
    }
}
