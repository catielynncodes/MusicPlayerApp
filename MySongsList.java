package com.example.catie.musicplayerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.catie.musicplayerapp.R;
import com.example.catie.musicplayerapp.Song;
import com.example.catie.musicplayerapp.SongAdapter;

import java.util.ArrayList;

public class MySongsList extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_songs_list);



        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("one", "lutti"));
        songs.add(new Song("two", "otiiko"));
        songs.add(new Song("three", "tolookosu"));
        songs.add(new Song("four", "oyyisa"));
        songs.add(new Song("five", "massokka"));
        songs.add(new Song("six", "temmokka"));
        songs.add(new Song("seven", "kenekaku"));
        songs.add(new Song("eight", "kawinta"));
        songs.add(new Song("nine", "wo’e"));
        songs.add(new Song("ten", "na’aacha"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // my_songs_list file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

    }
}
