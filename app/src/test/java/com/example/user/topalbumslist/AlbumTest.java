package com.example.user.topalbumslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 05/07/2017.
 */

public class AlbumTest {

    Album album;

    @Before
    public void before() {album = new Album(70, "Appetite for Destruction", "Guns 'N' Roses");}

    @Test
    public void getRankingTest() {
        assertEquals((Integer)70, album.getRanking());
    }
}
