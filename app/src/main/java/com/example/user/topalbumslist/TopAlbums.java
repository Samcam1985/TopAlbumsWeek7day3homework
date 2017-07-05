package com.example.user.topalbumslist;


import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopAlbums {

    private ArrayList<Album> list;

    public TopAlbums() {
        list = new ArrayList<Album>();
        list.add(new Album(1,"Divide", "Ed Sheeran"));
        list.add(new Album(2, "Ok Computer", "Radiohead"));
        list.add(new Album(3, "Evolve", "Imagine Dragons"));
        list.add(new Album(4, "How Did We Get So Dark", "Royal Blood"));
        list.add(new Album(5, "Human", "Rag N Bone Man"));
        list.add(new Album(6, "Greatest Hits", "Foo Fighters"));
        list.add(new Album(7, "Purple Rain", "Prince & The Revolution"));
        list.add(new Album(8, "Truth Is A Beautiful Thing", "London Grammar"));
        list.add(new Album(9, "Timeless - The All-Time Greatest Hits", "Bee Gees"));
        list.add(new Album(10, "Grateful", "DJ Khaled"));
        list.add(new Album(11, "Melodrama", "Lorde"));
        list.add(new Album(12, "X", "Ed Sheeran"));
        list.add(new Album(13,"Adios", "Glen Campbell"));
        list.add(new Album(14, "Glory Days", "Little Mix"));
        list.add(new Album(15, "Sgt Pepper's Lonely Hearts Band Club", "The Beatles"));
        list.add(new Album(16, "Feed The Machine", "Nickelback"));
        list.add(new Album(17, "Lindsey Buckingham/Christine McVie", "Buckingham/Mcvie"));
        list.add(new Album(18, "Time Flies - 1994-2009", "Oasis"));
        list.add(new Album(19, "Royal Blood", "Royal Blood"));
        list.add(new Album(20, "More Life", "Drake"));
        list.add(new Album(21, "+", "Ed Sheeran"));
        list.add(new Album(22, "Dua Lipa", "Dua lipa"));
        list.add(new Album(23, "Witness", "Katy Perry"));
        list.add(new Album(24, "My Everything", "Ariana Grande"));
        list.add(new Album(25, "Common Sense", "J Hus"));
        list.add(new Album(26, "25", "Adele"));
        list.add(new Album(27, "All Over The World - The Very Best Of", "Elo"));
        list.add(new Album(28, "Moana", "Motion Picture Cast Recording"));
        list.add(new Album(29, "Gang Signs & Prayer", "Stormzy"));
        list.add(new Album(30, "Live At Carnegie Hall - An Acoustic", "Joe Bonamassa"));
    }

    public ArrayList<Album> getList() { return new ArrayList<Album>(list);}

}
