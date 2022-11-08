package com.sagesongr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Helloworld {
    @RequestMapping(value ="/hello", method = RequestMethod.GET)

    @ResponseBody
    public String getHome(){
        return "hello world";
    }

    @GetMapping("/capitalize/{word}")
    @ResponseBody
    public String capitalizePhrase(@PathVariable String word){
        return word.toUpperCase();
    }

    @GetMapping("/")
    public String splashpage(){
        return "capitalized";
    }

}
