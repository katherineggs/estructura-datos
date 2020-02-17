package com.app.tarea5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class app {
    static int cantidad[] = new int[30];
    static String top[] = new String[30];
    static int indexT = 0;
    static char l;
    static String fin = "";
    static String result = "";
    @RequestMapping(value = {"/text"})
    @ResponseBody
    public static String textCount(@RequestParam String text){
        text = text.toLowerCase();
        for(int i = 0; i < text.length() + 1; i++){
            text = text.replaceAll("\\s+","");
            String tp = "";
            int cant = 0;
            l = text.charAt(0);
            for(int j = 0; j < text.length(); j++) {
                if (l == text.charAt(j)) {
                    cant++;
                    tp = tp + "*";
                }
            }
            text = text.replace(l, ' ');
            cantidad[indexT] = cant;
            fin = fin +" "+l+" * "+Integer.toString(cant)+"  "+tp+"\n";
            top[indexT]= fin;
            indexT++;
        }
        for(int mayor = 0; mayor < cantidad.length-1; mayor ++){
                if(cantidad[mayor] < cantidad[mayor + 1] ){
                    int var = cantidad[mayor];
                    cantidad[mayor] = cantidad[mayor+1];
                    cantidad[mayor+1] = var; //numeros
                    String ast = top[mayor];
                    top[mayor] = top[mayor+1];
                    top[mayor+1] = ast; //asteriscos
                }
        }
        for(int i =0; i < 10; i++){
            result = result + top[i];
        }
        return result;
    }
}
