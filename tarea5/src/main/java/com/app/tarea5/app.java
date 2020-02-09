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
    String top[] = new String[30];
    int indexL = 0;
    int indexT = 0;
    char l;
    String fin = "";
    @RequestMapping(value = {"/text"})
    @ResponseBody
    public String textCount(@RequestParam String text){
        text = text.toLowerCase();
        for(int i = 0; i < text.length() + 1; i++){
            text = text.replaceAll("\\s+","");
            String tp = "";
            int cant = 0;
            letra[indexL] = text.charAt(0);
            l = text.charAt(0);
            for(int j = 0; j < text.length(); j++) {
                if (l == text.charAt(j)) {
                    cant++;
                    tp = tp + "*";
                }
            }
            text = text.replace(l, ' ');
            cantidad[indexT] = cant;
            top[indexT] = tp;
            indexT++;
            indexL++;
        }
        for(int mayor = 0; mayor < cantidad.length-1; mayor ++){
            if(cantidad[mayor] < cantidad[mayor + 1] ){
                int var = cantidad[mayor];
                cantidad[mayor] = cantidad[mayor+1];
                cantidad[mayor+1] = var; //numeros
                char v = letra[mayor];
                letra[mayor] = letra[mayor+1];
                letra[mayor+1] = v; //letras
                String ast = top[mayor];
                top[mayor] = top[mayor+1];
                top[mayor+1] = ast; //asteriscos
            }
        }
        for(int num = 0; num < 10; num ++){
            fin = fin+" "+ Integer.toString(num+1)+". "+letra[num]+" * "+Integer.toString(cantidad[num])+" "+top[num]+"\n";
        }
//        System.out.println(Arrays.toString(cantidad));
//        System.out.println(Arrays.toString(letra));
//        System.out.println(fin);
        return fin;
    }
}
