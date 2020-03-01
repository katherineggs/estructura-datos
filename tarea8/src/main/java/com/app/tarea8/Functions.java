package com.app.tarea8;

import java.util.Random;

public class Functions {
    static int sizeDB, sizeQ, sizeT = 0;
    static int  indexDB, indexQ, indexT = 0;
    static boolean working, exists = false;
    static Object data[] = new Object[sizeDB];
    static Object queue[] = new Object[sizeQ];
    static Object today[] = new Object[sizeT];

    public static void begin(){
        Functions.workersDBase("Pedro", 11111, 1, "");
        Functions.workersDBase("Maria", 11112, 1, "");
        Functions.workersDBase("Pedro", 11111, 1, "");
        Functions.workersDBase("Julian", 11113, 1, "");
    }

//  C Add worker to the data base
    public static void workersDBase(String name,int socialNum, int workDay, String entity){
        exists = false;
        for(int i = 0; i < sizeDB; i++){
            if(data[i].name == name){
                exists = true;
            }
        }
        if(!exists) {
            Object temp[] = data;
            sizeDB++;
            data = new Object[sizeDB];
            for (int i = 0; i < sizeDB-1; i++) {
                data[i] = temp[i];
            }
            data[indexDB] = new Object(name, socialNum, workDay, entity);
            indexDB++;
        }
    }

//  D Things to be done THE QUEUE
    public static String workersQueue(){
        String fin = "";
        for(int i = 0; i < sizeT; i++){
            Random rand = new Random();
            int random = rand.nextInt(today.length-1);
            Object worker = data[random];

            if(queue.length != 0){
                if(i < queue.length) {
                    if (queue[i].name == worker.name) {
                        working = true;
                    }
                }
                if(!working){
                    Object temp[] = queue;
                    sizeQ ++;
                    queue = new Object[sizeQ];
                    for(int a = 0; a < sizeQ-1; a++){
                        queue[a] = temp[a];
                    }
                    queue[indexQ] = worker;
                    indexQ ++;
                }
            }
            if(queue.length == 0){
                Object temp[] = queue;
                sizeQ ++;
                queue = new Object[sizeQ];
                for(int a = 0; a < sizeQ-1; a++){
                    queue[a] = temp[a];
                }
                queue[indexQ] = worker;
                indexQ ++;
            }
        }
        sizeQ = sizeQ;
        working = false;
        for(int i = 0; i < queue.length; i++){
            fin = fin + queue[i].name + "   \n";
        }
        return fin;
    }

//  D When finished show who is off
    public static String workersDeQueue(){
        workersQueue();
        Object workerDone = queue[sizeQ-1];
        Object temp[] = queue;
        sizeQ --;
        queue = new Object[sizeQ];
        for(int i = 0; i < sizeQ; i++){
            queue[i] = temp[i];
        }
        String worker = workerDone.name + " " + workerDone.entity;
        return workersQueue() +" WORKER " + worker;
    }

//  A Structure for security social number & entity
    public static void queueToday(int socialNum, String entity){
        Object temp[] = today;
        sizeT ++;
        today = new Object[sizeT];
        for(int i = 0; i < sizeT -1; i++){
            today[i] = temp[i];
        }
        today[indexT] = new Object(socialNum,entity);
        indexT ++;
    }

//  B update of the data base
    public static String update(){
        begin();
        String fin = "";
        for(int cont = 0; cont < today.length; cont++) {
            for (int i = 0; i < data.length; i++) {
                if (data[i].socialNum == today[cont].socialNum) {
                    data[i].entity = today[cont].entity;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            fin = fin + data[i].name + " " + (data[i].entity) + " " + Integer.toString(data[i].socialNum) + "   \n";
        }
        return fin;
    }

}
