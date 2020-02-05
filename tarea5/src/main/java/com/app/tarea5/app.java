package com.app.tarea5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class app {
    int cantidad[] = new int[30];
    char letra[] = new char[30];
    int indexL = 0;
    int indexT = 0;
    char l;
    @RequestMapping(value = {"/text"})
    @ResponseBody
    public void textCount(@RequestParam String text){
        for(int i = 0; i < text.length() -1; i++){
            int cant = 0;
            letra[indexL] = text.charAt(i);
            l = text.charAt(i);
            for(int j = 0; j < text.length() -1; j++) {
                if (l == text.charAt(j)) {
                    cant++;
                }
                cantidad[indexT] = cant;
                indexT ++;
                indexL ++;
            }
        }
        System.out.println(Arrays.toString(cantidad));
        System.out.println(Arrays.toString(letra));
    }
}
