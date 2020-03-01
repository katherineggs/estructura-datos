package com.app.tarea8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class Main {
    @RequestMapping(value = {"/add"})
    @ResponseBody
    public static String trail(@RequestParam String entity, int socialNum){
        Functions.queueToday(socialNum, entity);
        Functions.update();
        return Functions.update();
    }
    @RequestMapping(value = {"/remove"})
    @ResponseBody
    public static String deQueue(){
        return Functions.workersDeQueue();
    }
}
