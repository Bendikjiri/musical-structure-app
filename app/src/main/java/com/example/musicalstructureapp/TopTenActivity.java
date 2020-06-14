package com.example.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class TopTenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songList = new ArrayList<Song>();
        songList.add(new Song(getString(R.string.song1), getString(R.string.artist1)));
        songList.add(new Song(getString(R.string.song2), getString(R.string.artist2)));
        songList.add(new Song(getString(R.string.song3), getString(R.string.artist3)));
        songList.add(new Song(getString(R.string.song4), getString(R.string.artist4)));
        songList.add(new Song(getString(R.string.song5), getString(R.string.artist5)));
        songList.add(new Song(getString(R.string.song6), getString(R.string.artist6)));
        songList.add(new Song(getString(R.string.song7), getString(R.string.artist7)));
        songList.add(new Song(getString(R.string.song8), getString(R.string.artist8)));
        songList.add(new Song(getString(R.string.song9), getString(R.string.artist9)));
        songList.add(new Song(getString(R.string.song10), getString(R.string.artist10)));

        SongAdapter adapter= new SongAdapter(this, songList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
