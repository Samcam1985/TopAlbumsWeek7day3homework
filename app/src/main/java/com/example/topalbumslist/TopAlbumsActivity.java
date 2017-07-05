package com.example.topalbumslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);

        TopAlbums topAlbums = new TopAlbums();
        ArrayList<Album> list = topAlbums.getList();

        TopAlbumsAdapter albumAdapter = new TopAlbumsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter((albumAdapter));
    }

    public void getAlbum(View listItem) {
        Album album = (Album) listItem.getTag();
        Log.d(getClass().toString(),album.getTitle());
    }
}
