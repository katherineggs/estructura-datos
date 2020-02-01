package com.queue.tarea3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class app {
//    ArrayList<String> queue = new ArrayList<>();
    String queue[];
    int capacity = 0;
    int index = -1;

    public void Bank(){
        queue = new String[15];
    }

    @RequestMapping(value = {"/push"})
    @ResponseBody
    public String[] pushQueue(@RequestParam String info){
        queue[index++]=info;
        capacity ++;
        if(capacity >= 15){
            String new_queue[] = new String[capacity*2];
            return  new_queue;
        }
//        for(int i = 0; i < 15; i++){
//            if (queue[i].equals(0)){
//                queue[i]= info;
//            }
//        }
//        Tarea3.push(info ,queue);
        else{
            return queue;
        }
    }
    @RequestMapping(value = {"/pop"})
    @ResponseBody
    public String[] popQueue(){
        for(int i = 0; i > 15; i++ ){
            queue[i] = queue[i+1];
        }
        return queue;
    }
    @RequestMapping(value = {"/clear"})
    @ResponseBody
    public String[] clearQueue(){
        for(int i = 0; i > 15; i++ ){
            queue[i] = "cleared";
        }
//        Tarea3.clear(queue);
        return queue;
    }
    @RequestMapping(value = {"/show"})
    @ResponseBody
    public String[] showQueue(){

//        Tarea3.show(queue);
        return queue;
    }

}
