package com.sagesongr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Album {
    @GetMapping("/album/{song}/{artist}")
    public String songCollection(@PathVariable String song, String artist, Model m){
        m.addAttribute("title", song);
        m.addAttribute("artist", artist);
        m.addAttribute("songCount", 2);
        m.addAttribute("length", 180);
        return "album";
    }

    @GetMapping("/albums")
    @ResponseBody
    public String albumList(){
        String[] suggested = {"Kings and Queens", "Infinity Train", "Gravity Falls"};
        String theList = suggested.toString();
        return theList;
    }
}
