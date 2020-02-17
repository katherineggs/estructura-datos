package com.app.tarea6;

import org.springframework.web.bind.annotation.RequestParam;

public class Met {
    public static String ubicacion(int x, int y){
        String ret = "";
        if(x >=0 && y>=0){
            ret = "Cuadrante 1";
        } else if(x < 0 && y >= 0){
            ret = "Cuadrante 2";
        } else if(x < 0 && y < 0){
            ret = "Cuadrante 3";
        } else if(x >=0 && y < 0){
            ret = "Cuadrante 4";
        } return ret;
    }
}
