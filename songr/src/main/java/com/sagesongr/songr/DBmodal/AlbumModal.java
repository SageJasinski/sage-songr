package com.sagesongr.songr.DBmodal;

import javax.persistence.*;
import java.util.List;

@Entity
public class AlbumModal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "album")
    List<Song> songsInAlbum;

    String title;
    String artist;
    int songCount;
    int length;
    String imgURL;

    protected AlbumModal() {
    }

    public List<Song> getSongsInAlbum() {
        return songsInAlbum;
    }

    public void setSongsInAlbum(List<Song> songsInAlbum) {
        this.songsInAlbum = songsInAlbum;
    }

    public AlbumModal(String title, String artist, int songCount, int length, String imgURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
