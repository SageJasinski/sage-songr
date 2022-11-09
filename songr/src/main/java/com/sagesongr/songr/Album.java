package com.sagesongr.songr;

import com.sagesongr.songr.DBmodal.AlbumModal;
import com.sagesongr.songr.Interface.AlbumInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Album {
    @Autowired
    AlbumInterface albumInterface;

//    @GetMapping("/album/{song}")
//    public String songCollection(@PathVariable String song, String artist, Model m){
//        m.addAttribute("title", song);
//        m.addAttribute("artist", artist);
//        m.addAttribute("songCount", 2);
//        m.addAttribute("length", 180);
//        return "album";
//    }

    @GetMapping("/album")
    public String albumList(Model m){
        List<AlbumModal> albums = albumInterface.findAll();
        m.addAttribute("albums", albums);
        return "album";
    }

    @PostMapping("/album")
    public String albumMaking(String title, String artist, int count,int length){
        AlbumModal newAlbum = new AlbumModal(title,artist,count,length,"http://exampleimg.io");
        albumInterface.save(newAlbum);
        return "album";
    }


}
