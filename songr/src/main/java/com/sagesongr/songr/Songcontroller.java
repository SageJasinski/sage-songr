package com.sagesongr.songr;

import com.sagesongr.songr.DBmodal.AlbumModal;
import com.sagesongr.songr.DBmodal.Song;
import com.sagesongr.songr.Interface.AlbumInterface;
import com.sagesongr.songr.Interface.SongInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class Songcontroller {

    @Autowired
    SongInterface songInterface;
    @Autowired
    AlbumInterface albumInterface;

    @GetMapping("/songs")
    public String songCollection(Model m)
    {
        List<Song> collection = songInterface.findAll();
        m.addAttribute("songs", collection);
        return "album";
    }

    @PostMapping("/songs")
    public RedirectView addSong(String songTitle,Integer songLength, Integer trackNum, String titleAlbum)
    {
        AlbumModal albumModal = albumInterface.findByTitle(titleAlbum);
        Song newSong = new Song(songTitle, songLength, trackNum, albumModal);
        songInterface.save(newSong);
        return new RedirectView("album");
    }

}
