package com.example.user.topalbumslist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class TopAlbumsTest {

    @Test
    public void getListTest() {
        TopAlbums topAlbums = new TopAlbums();
        assertEquals(30, topAlbums.getList().size());
    }
}
