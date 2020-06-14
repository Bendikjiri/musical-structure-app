package com.example.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songList = new ArrayList<Song>();
        songList.add(new Song("Savage", "Megan Thee Stallion Featuring Beyonce"));
        songList.add(new Song("Blinding Lights", "The Weeknd"));
        songList.add(new Song("Say So", "Doja Cat Featuring Nicki Minaj"));
        songList.add(new Song("Rain On Me", "Lady Gaga & Ariana Grande"));
        songList.add(new Song("Toosie Slide", "Drake"));
        songList.add(new Song("Don't Start Now", "Dua Lipa"));
        songList.add(new Song("Intentions", "Justin Bieber Featuring Quavo"));
        songList.add(new Song("The Box", "Roddy Ricch"));
        songList.add(new Song("Roses", "SAINt JHN"));
        songList.add(new Song("Savage", "Megan Thee Stallion Featuring Beyonce"));
        songList.add(new Song("Blinding Lights", "The Weeknd"));
        songList.add(new Song("Say So", "Doja Cat Featuring Nicki Minaj"));
        songList.add(new Song("Rain On Me", "Lady Gaga & Ariana Grande"));
        songList.add(new Song("Toosie Slide", "Drake"));
        songList.add(new Song("Don't Start Now", "Dua Lipa"));
        songList.add(new Song("Intentions", "Justin Bieber Featuring Quavo"));
        songList.add(new Song("The Box", "Roddy Ricch"));
        songList.add(new Song("Roses", "SAINt JHN"));
        songList.add(new Song("Savage", "Megan Thee Stallion Featuring Beyonce"));
        songList.add(new Song("Blinding Lights", "The Weeknd"));
        songList.add(new Song("Say So", "Doja Cat Featuring Nicki Minaj"));
        songList.add(new Song("Rain On Me", "Lady Gaga & Ariana Grande"));
        songList.add(new Song("Toosie Slide", "Drake"));
        songList.add(new Song("Don't Start Now", "Dua Lipa"));
        songList.add(new Song("Intentions", "Justin Bieber Featuring Quavo"));
        songList.add(new Song("The Box", "Roddy Ricch"));
        songList.add(new Song("Roses", "SAINt JHN"));

        SongAdapter adapter= new SongAdapter(this, songList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

