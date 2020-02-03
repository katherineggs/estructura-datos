package com.control.Tarea4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class app {
    int sizeDeb = 0;
    int sizeCred = 0;
    int indexDeb = 0;
    int indexCred = 0;
    int creditos[] = Tarea4.Creds(sizeCred);
    int debitos[] = Tarea4.Debs(sizeDeb);

    @RequestMapping(value = {"/debitos"})
    @ResponseBody
    public int[] setDebitos(@RequestParam int dato){
        int[] temp_deb = debitos;
        sizeDeb = sizeDeb +1;
        debitos = new int[sizeDeb];

        for(int i = 0; i <= sizeDeb -2; i++){
            debitos[i] = temp_deb[i];
        }
        debitos[indexDeb] = dato;
        indexDeb = indexDeb +1;
        return debitos;
    }
    @RequestMapping(value = {"/creditos"})
    @ResponseBody
    public int[] setCreditos(@RequestParam int dato){
        int[] temp_creds = creditos;
        sizeCred = sizeCred +1;
        creditos = new int[sizeCred];

        for(int i = 0; i <= sizeCred -2; i++){
            creditos[i] = temp_creds[i];
        }
        creditos[indexCred] = dato;
        indexCred = indexCred +1;
        return creditos;
    }
    @RequestMapping(value = {"/totD"})
    @ResponseBody
    public int totalDebs(){
        int total = 0;
        for(int i = 0; i < sizeDeb -1; i++){
            total = total + debitos[i];
        }
        return total;
    }
    @RequestMapping(value = {"/totC"})
    @ResponseBody
    public int totalCreds(){
        int total = 0;
        for(int i = 0; i < sizeCred -1; i++){
            total = total + creditos[i];
        }
        return total; }
    @RequestMapping(value = {"/Saldo"})
    @ResponseBody
    public String Saldo(){
        //total debitos - total creditos
        int saldo = totalDebs() - totalCreds();
        String resp = "El saldo es: "+ saldo;
        return resp; }
    @RequestMapping(value = {"/Prom"})
    @ResponseBody
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
        int prom = totalDebs()/sizeDeb;
        String ret = "El promedio de debitos es "+ prom;
        return ret; }
    @RequestMapping(value = {"/big"})
    @ResponseBody
    public String biggerDebs(){
        int bigger;
        for(int i = 0; i < sizeDeb - 1; i++){
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
        String fin = totDebs + "/n" + totCreds + "/n" + Saldo + "/n" + prom + "/n" + bigger;
        return fin;
    }
}
