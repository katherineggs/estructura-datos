package com.control.Tarea4;

import org.springframework.stereotype.Controller;

@Controller
public class app {
    public static String[] Debs(){
        String debitos[] = new String[20];
        return debitos;
    }
    public static String[] Creds(){
        String[] creditos = new String[20];
        return creditos;
    }
    String creditos[] = Creds();
    String debitos[] = Debs();

    public String totalDebs(){
        String total = "0"; //DEBE SER INT O ALGO ASI
        for(int i = 0; i < 20 -1; i++){
            total = total + debitos[i];
        }
        return total;
    }
    public String totalCreds(){
        String total = "0"; //DEBE SER INT O ALGO ASI
        for(int i = 0; i < 20 -1; i++){
            total = total + creditos[i];
        }
        return total;
    }

    public String Saldo(){
        //total debitos - total creditos
        return "hola";
    }
    public String promDebs(){
        int cantidad = 0;
        for(int i = 0; i < 20 - 1; i++){
            if(debitos[i].isEmpty()){
                cantidad = cantidad;
            }
            else{
                cantidad ++;
            }
        }
        //total debitos / cantidad en debs
        return"hola";
    }

    public String biggerDebs(){
        String bigger;
        for(int i = 0; i < 20 - 1; i++){
//            if(debitos[i] < debitos[i+1]){ //DEBE SER INT O ALGO ASI
//                debitos[i] = debitos[i+1] //Y ALGO MAS
//            }
            bigger = debitos[i]; //La primer casilla
        }
        return "ola";//bigger
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
