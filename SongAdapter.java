package com.example.catie.musicplayerapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {
    public SongAdapter(Context context, ArrayList<Song> pSongs) {
        super(context,0, pSongs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song my_song= (Song) getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        miwokTextView.setText(my_song.getSongTitle());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        defaultTextView.setText(my_song.getArtistName());

        return listItemView;
    }
}