package com.example.user.topalbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.topalbumslist.Album;
import com.example.user.topalbumslist.R;
import com.example.user.topalbumslist.TopAlbums;

import java.util.ArrayList;

public class TopAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);

        TopAlbums topAlbums = new TopAlbums();
        ArrayList<Album> list = topAlbums.getList();
    }
}
