package com.queue.tarea3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class app {
    int index = 0;
    int size = 0;
    public static String[] Bank(int size){
        String q[] = new String[size];
        return q;
    }
    String queue[] = Bank(size);
    @RequestMapping(value = {"/push"})
    @ResponseBody
    public String pushQueue(@RequestParam String info){
        String temp_queue[] = queue;
        size = size +1;
        queue = new String[size];

        for(int i = 0; i <= size -2; i++){
            queue[i] = temp_queue[i];
        }
        queue[index] = info;
        index = index +1;
        return "Bienvenido al banco!";
    }
    @RequestMapping(value = {"/pop"})
    @ResponseBody
    public String popQueue(){
        for(int i = 0; i < size -1; i++ ){
            queue[i] = queue[i+1];
        }
        queue[size -1] = null;
        return "Adios!";
    }
    @RequestMapping(value = {"/clear"})
    @ResponseBody
    public String clearQueue(){
        for(int i = 0; i < size -1; i++ ){
            queue[i] = null;
        }
        return "Banco libre!";
    }
    @RequestMapping(value = {"/show"})
    @ResponseBody
    public String[] showQueue(){
        return queue;
    }

}
