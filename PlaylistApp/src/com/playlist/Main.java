package com.playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    private static Playlist playlist;

    public static void main(String[] args) {

        initialize();
        System.out.print("Enter playlist name: ");
        String listName = scanner.nextLine();
        playlist = new Playlist(listName);
        System.out.println(listName + " created successfully!!");
        printInstructions();
        boolean flag = true;
        while (flag) {
            System.out.print("Enter your selection (5 for options list): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice > 0) {
                switch (choice) {
                    case 1:
                        System.out.println();
                        System.out.println("Choose album");
                        playlist.printAlbumList();
                        System.out.print("Enter album: ");
                        int albumChoice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();
                        System.out.println(playlist.albums.get(albumChoice - 1).getAlbumTitle() + " Tracklist: ");
                        playlist.albums.get(albumChoice - 1).printTrackList();
                        System.out.print("Enter song to add: ");
                        int songChoice = scanner.nextInt();
                        scanner.nextLine();
                        Song tempSong = new Song(playlist.albums.get(albumChoice - 1).songs.get(songChoice - 1).getTitle(),
                                playlist.albums.get(albumChoice - 1).songs.get(songChoice - 1).getDuration());
                        playlist.songs.add(tempSong);
                        System.out.println(tempSong.getTitle() + " added successfully to " + playlist.getPlaylistName());
                        System.out.println();
                        break;
                    case 2:
                        playlist.printPlaylist(playlist.songs);
                        int removeChoice = scanner.nextInt();
                        scanner.nextLine();
                        playlist.songs.remove(removeChoice - 1);
                        System.out.println("Song successfully removed from the playlist");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println(playlist.getPlaylistName() + " tracklist:");
                        playlist.printPlaylist(playlist.songs);
                        System.out.println();
                        break;
                    case 4:
                        play();
                        break;
                    case 5:
                        printInstructions();
                        break;
                    case 6:
                        flag = false;
                        System.out.println("Goodbye...");
                        break;
                }
            }

        }

    }

    private static void initialize() {
        System.out.println("Welcome to the Playlist App");
    }

    private static void printInstructions() {
        System.out.println();
        System.out.println("Please make a selection:");
        System.out.println("1 - Add song to playlist");
        System.out.println("2 - Remove song from playlist");
        System.out.println("3 - Show playlist tracklist");
        System.out.println("4 - Play");
        System.out.println("5 - Options");
        System.out.println("6 - Exit Playlist App");
    }

    private static void play() {
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.songs.listIterator();

        if (playlist.songs.isEmpty()) {
            System.out.println("There are no songs to play. Add some songs and try again!");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            System.out.print("Previous(1) -or- Next(2) -or- Stop(3)");
            int prevNext = scanner.nextInt();
            switch (prevNext) {
                case 1:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        System.out.println();
                    } else {
                        System.out.println("You are at the start of the list");
                        listIterator.next();
                        System.out.println();
                        goingForward = true;
                    }
                    break;
                case 2:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                        System.out.println();
                    } else {
                        System.out.println("You have reached the end of the playlist");
                        System.out.println();
                        goingForward = false;
                    }
                    break;
                case 3:
                    quit = true;
                    System.out.println("Exiting play mode.");
                    System.out.println();
                    break;
            }
        }
    }


}
