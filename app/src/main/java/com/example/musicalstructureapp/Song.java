package com.example.musicalstructureapp;

public class Song {

    private String mSong;
    private String mArtist;

    public Song (String song, String atrist) {
        mSong = song;
        mArtist = atrist;
    }

    public String getSong() {
        return mSong;
    }

    public String getArtist() {
        return mArtist;
    }
}
