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
//    ArrayList<String> queue = new ArrayList<>();
    int capacity = 0;
    int index = 0;

    public static String[] Bank(){
        String q[] = new String[5];
        return q;
    }
    String queue[] = Bank();

    @RequestMapping(value = {"/push"})
    @ResponseBody
    public String[] pushQueue(@RequestParam String info){
        queue[index++]=info;
        capacity ++;
//        if(capacity >= 5){
//            String new_queue[] = new String[capacity*2];
//            return  new_queue;
//        }
////        for(int i = 0; i < 5; i++){
////            if (queue[i].equals(0)){
////                queue[i]= info;
////            }
////        }
////        Tarea3.push(info ,queue);
//        else{
//            return queue;
//        }
        return queue;
    }
    @RequestMapping(value = {"/pop"})
    @ResponseBody
    public String[] popQueue(){
        for(int i = 0; i < 5 - 1; i++ ){
            queue[i] = queue[i+1];
            queue[5 -1] = null;
        }
        return queue;
    }
    @RequestMapping(value = {"/clear"})
    @ResponseBody
    public String[] clearQueue(){
        for(int i = 0; i < 5; i++ ){
            queue[i] = null;
        }
        return queue;
    }
    @RequestMapping(value = {"/show"})
    @ResponseBody
    public String[] showQueue(){
        return queue;
    }

}
