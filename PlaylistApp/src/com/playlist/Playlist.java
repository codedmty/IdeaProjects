package com.playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Playlist {
    private String playlistName;
    ArrayList<Album> albums;
    LinkedList<Song> songs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        albums = new ArrayList<>();
        songs = new LinkedList<>();
        albums.add(createNevermind());
        albums.add(createWastingLight());
        albums.add(createGrayChapter());
        albums.add(createWorshipTribute());
    }

    public String getPlaylistName() {
        return playlistName;
    }


    public void printAlbumList() {
        for(int i = 0; i < albums.size(); i++) {
            System.out.println((i+1) +" - " + albums.get(i).getAlbumTitle());
        }
    }

    public void printPlaylist(LinkedList<Song> linkedList) {
        Iterator<Song> i = linkedList.iterator();
        int index = 0;
        while(i.hasNext()) {
            System.out.println((index + 1) + " " + songs.get(index).getTitle());
            index++;
            i.next();
        }

    }

    private static Album createNevermind() {
        Album nevermind = new Album("Nevermind");
        nevermind.addSong("Smells Like Teen Spirit", 5.01);
        nevermind.addSong("In Bloom", 4.15);
        nevermind.addSong("Come as You Are", 3.39);
        nevermind.addSong("Breed", 3.04);
        nevermind.addSong("Lithium", 4.17);
        nevermind.addSong("Polly", 2.57);
        nevermind.addSong("Territorial Pissings", 2.23);
        nevermind.addSong("Drain You", 3.44);
        nevermind.addSong("Lounge Act", 2.37);
        nevermind.addSong("Stay Away", 3.32);
        nevermind.addSong("On a Plain", 3.16);
        nevermind.addSong("Something in the Way", 20.35);
        return nevermind;
    }

    private static Album createWastingLight() {
        Album wastingLight = new Album("Wasting Light");
        wastingLight.addSong("Bridge Burning", 4.47);
        wastingLight.addSong("Rope", 4.19);
        wastingLight.addSong("Dear Rosemary", 4.27);
        wastingLight.addSong("White Limo", 3.23);
        wastingLight.addSong("Arlandria", 4.28);
        wastingLight.addSong("These Days", 4.59);
        wastingLight.addSong("Back & Forth", 3.52);
        wastingLight.addSong("A Matter of Time", 4.36);
        wastingLight.addSong("Miss the Misery", 4.34);
        wastingLight.addSong("I Should Hvae Known", 4.16);
        wastingLight.addSong("Walk", 4.16);
        wastingLight.addSong("Better Off", 4.12);
        return wastingLight;

    }

    private static Album createGrayChapter() {
        Album grayChapter = new Album(".5: The Gray Chapter");
        grayChapter.addSong("XIX", 3.10);
        grayChapter.addSong("Sarcastrophe", 5.06);
        grayChapter.addSong("AOV", 5.33);
        grayChapter.addSong("The Devil In I", 5.43);
        grayChapter.addSong("Killpop", 3.45);
        grayChapter.addSong("Skeptic", 4.47);
        grayChapter.addSong("Lech", 4.51);
        grayChapter.addSong("Goodbye", 4.35);
        grayChapter.addSong("Nomadic", 4.18);
        grayChapter.addSong("The One That Kills The Least", 4.12);
        grayChapter.addSong("Custer", 4.15);
        grayChapter.addSong("Be Prepared for Hell", 1.58);
        grayChapter.addSong("The negative One", 5.25);
        grayChapter.addSong("If Rain Is What You Want", 6.21);
        grayChapter.addSong("Override", 5.37);
        grayChapter.addSong("The Burden", 5.23);
        return grayChapter;
    }

    private static Album createWorshipTribute() {
        Album worshipTribute = new Album("Worship and Tribute");
        worshipTribute.addSong("Tip Your Bartender", 2.59);
        worshipTribute.addSong("Mu Empire", 3.45);
        worshipTribute.addSong("Cosmopolitan Blood Loss", 3.05);
        worshipTribute.addSong("Ape Dos Mil", 5.03);
        worshipTribute.addSong("Pink Roses", 2.57);
        worshipTribute.addSong("Must've Run All Day", 4.53);
        worshipTribute.addSong("Stuck Pig", 3.23);
        worshipTribute.addSong("Radio Cambodia", 2.56);
        worshipTribute.addSong("The Gillette Calvacade of Sports", 5.56);
        worshipTribute.addSong("Trailer Park Jesus", 4.30);
        worshipTribute.addSong("Two Tabs of Mescaline", 8.19);
        return worshipTribute;
    }

}
