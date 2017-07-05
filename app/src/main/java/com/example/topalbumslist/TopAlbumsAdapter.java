package com.example.topalbumslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopAlbumsAdapter extends ArrayAdapter<Album> {

    public TopAlbumsAdapter(Context context, ArrayList<Album> list) {
        super(context, 0, list);}

        @Override
        public View getView (int position, View listItemView, ViewGroup parent){
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.albums_item, parent, false);
            }

            Album currentAlbum = getItem(position);

            TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
            ranking.setText(currentAlbum.getRanking().toString());

            TextView title = (TextView) listItemView.findViewById(R.id.title);
            title.setText(currentAlbum.getTitle());

            TextView artist = (TextView) listItemView.findViewById(R.id.artist);
            artist.setText(currentAlbum.getArtist());

            return listItemView;

        }
    }
