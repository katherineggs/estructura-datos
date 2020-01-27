package com.queue.tarea3;

import java.util.ArrayList;

public class Tarea3 {
    public static ArrayList push(String trans, ArrayList queue){
        queue.add(trans);
        return queue;
    }
    public static ArrayList pop(ArrayList queue){
        try{
            queue.remove(0);
            System.out.println(queue);
        } catch (Exception e) {
            System.out.println("Lista vacia");
        }
        return queue;
    }
    public static ArrayList clear(ArrayList queue){
        queue.clear();
        return queue;
    }
    public static ArrayList show(ArrayList queue){
       return queue;
    }
}
