package com.example.catie.musicplayerapp;

/**
 * {@link Song} represents a song that the user wants to listen to.
 * It contains a song title and artist name for that song.
 */
public class Song {

    /**Title of the song */
    private String mSongTitle;

    /**Artist name */
    private String mArtistName;

    public Song(String songTitle, String artistName) {
        mSongTitle = songTitle;
        mArtistName = artistName;
    }

    /**
     *Get the title of the song.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the name of the artist for the song.
     */
    public String getArtistName() {
        return mArtistName;
    }

}