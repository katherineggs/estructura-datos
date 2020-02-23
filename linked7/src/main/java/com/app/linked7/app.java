package com.app.linked7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Random;


@Controller
public class app {
    static int size = 0;
    static int index = 0;
    static String play = "";
    static String newPlay = "";
    static String listSongs = "";
    static int pointer[] = new int[size];
    static String playlist[] = new String[size];

    @RequestMapping(value = {"/add"})
    @ResponseBody
    public static String addSong(@RequestParam String song){ //add to playlist?
        int p = 1;
        String temp[] = playlist;
        size ++;
        pointer = new int[size];
        playlist = new String[size];
        for(int i = 0; i < size -1; i++){
            playlist[i] = temp[i];
            pointer[i] = p;
            p ++;
        }
        pointer[index] = 0;
        playlist[index] = song;
        index ++;
        return "Song added!";
    }

    @RequestMapping(value = {"/play"})
    @ResponseBody
    public static String playNow(){
        Random rand = new Random();
        int aleat = rand.nextInt(pointer.length);
        play = playlist[aleat];
        return "Playing now: " + play;
    }

    @RequestMapping(value = {"/next"})
    @ResponseBody
    public static String playNext(){
        try{
            for(int i = 0; i < playlist.length; i++){
                if(playlist[i] == (play)){
                    int ind = pointer[i];
                    newPlay = playlist[ind];
                }
            }
            play = newPlay;
            return "Playing next: " + play;
        }
        catch (Exception e){
            return "No next song";
        }
    }

    @RequestMapping(value = {"/prev"})
    @ResponseBody
    public static String playPrevious(){
        try{
            for(int i = 0; i < playlist.length; i++){
            if(playlist[i] == (play)){
                newPlay = playlist[pointer[i-1]];
            }
        }
        play = newPlay;
        return "Previous song: " + play;
        }
        catch (Exception e){
            return "Not available now";
        }
    }

    @RequestMapping(value = {"/list"})
    @ResponseBody
    public static String listPlaylist(){
        for(int i = 0; i < pointer.length; i++){
            listSongs = listSongs + playlist[pointer[i]] + "\n";
        }
        return listSongs;
    }
}
