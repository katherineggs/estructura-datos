package com.control.Tarea4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class app {
    int size = 0;
    int index = 0;
//    public static int[] Debs(){
//        int debitos[] = new int[30];
////        AGREGAR 10 DATOS
//        return debitos;
//    }
//    public static int[] Creds(){
//        int[] creditos = new int[30];
////        AGREGAR 5 DATOS
//        return creditos;
//    }
    int creditos[] = Tarea4.Creds();
    int debitos[] = Tarea4.Debs();

    @RequestMapping(value = {"/debitos"})
    @ResponseBody
    public String setDebitos(@RequestParam int dato){
        int[] temp_deb = debitos;
        size = size +1;
        debitos = new int[size];

        for(int i = 0; i <= size -2; i++){
            debitos[i] = temp_deb[i];
        }
        debitos[index] = dato;
        index = index +1;
        return "Debito!";
    }
    @RequestMapping(value = {"/creditos"})
    @ResponseBody
    public String setCreditos(@RequestParam int dato){
        int[] temp_creds = creditos;
        size = size +1;
        creditos = new int[size];

        for(int i = 0; i <= size -2; i++){
            creditos[i] = temp_creds[i];
        }
        creditos[index] = dato;
        index = index +1;
        return "Credito!";
    }
    public int totalDebs(){
        int total = 0; //DEBE SER INT O ALGO ASI
        for(int i = 0; i < 20 -1; i++){
            total = total + debitos[i];
        }
        return total;
    }
    public int totalCreds(){
        int total = 0; //DEBE SER INT O ALGO ASI
        for(int i = 0; i < 20 -1; i++){
            total = total + creditos[i];
        }
        return total;
    }
    public String Saldo(){
        //total debitos - total creditos
        int saldo = totalDebs() - totalCreds();
        String resp = "El saldo es: "+ saldo;
        return resp;
    }
    public String promDebs(){ //total debitos / cantidad en debs
//        int cantidad = 0;
//        for(int i = 0; i < 20 - 1; i++){
//            if(debitos[i].isEmpty()){
//                cantidad = cantidad;
//            }
//            else{
//                cantidad ++;
//            }
//        }
        int prom = totalDebs()/size;
        String ret = "El promedio es "+ prom;
        return ret;
    }
    public String biggerDebs(){
        int bigger;
        for(int i = 0; i < 20 - 1; i++){
            if(debitos[i] < debitos[i+1]){ //DEBE SER INT O ALGO ASI
                debitos[i] = debitos[i+1]; //Y ALGO MAS
            }
        }
        bigger = debitos[0]; //La primer casilla
        String fin = "El debito mayor es " + bigger;
        return fin;//bigger
    }
    @RequestMapping(value = {"/final"})
    @ResponseBody
    public String respuestasFinales(){
        String totDebs = "El total de debitos es " + totalDebs();
        String totCreds = "El total de creditos es " + totalCreds();
        String Saldo = Saldo();
        String prom = promDebs();
        String bigger = biggerDebs();
        String fin = totDebs + "\n" + totCreds + "\n" + Saldo + "\n" + prom + "\n" + bigger;
        return fin;
    }

//    int size = 10;
//    public static String[] debis(size){
//        String debitos[] = new String[size];
//        return debitos;
//    }
//    public void credis(){
//        String creditos[] = new String[size];
//    }
//    String debitos =
//    public String totalDebs(){
//        int total = 0;
//        for(int i = 0; i < size; i++){
//            total = total + debitos[i];
//        }
//        return total;
//    }
//    public String totalCreds(){
//        int total = 0;
//        for(int i = 0; i < size; i++){
//            total = total + creditos[i];
//        }
//        return total;
//    }
//

}
