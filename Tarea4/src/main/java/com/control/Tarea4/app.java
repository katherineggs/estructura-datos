package com.control.Tarea4;

import org.springframework.stereotype.Controller;

@Controller
public class app {
    int creditos[];
    int debitos[];
    int size = 10;

    public void control(){
        creditos = new int[size];
        debitos = new int[size];
    }

    public int totalDebs(){
        int total = 0;
        for(int i = 0; i < size; i++){
            total = total + debitos[i];
        }
        return total;
    }
    public int totalCreds(){
        int total = 0;
        for(int i = 0; i < size; i++){
            total = total + creditos[i];
        }
        return total;
    }


}
