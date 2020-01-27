package com.queue.tarea3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class app {
    ArrayList<String> queue = new ArrayList<>();

    @RequestMapping(value = {"/push"})
    @ResponseBody
    public ArrayList pushQueue(@RequestParam String info){
        Tarea3.push(info ,queue);
        return queue;
    }
    @RequestMapping(value = {"/pop"})
    @ResponseBody
    public ArrayList popQueue(){
        Tarea3.pop(queue);
        return queue;
    }
    @RequestMapping(value = {"/clear"})
    @ResponseBody
    public ArrayList clearQueue(){
        Tarea3.clear(queue);
        return queue;
    }
    @RequestMapping(value = {"/show"})
    @ResponseBody
    public ArrayList showQueue(){
        Tarea3.show(queue);
        return queue;
    }

}
