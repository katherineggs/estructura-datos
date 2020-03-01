package com.app.tarea8;


public class Object {
    String name,entity;
    int socialNum, workDay;
    public Object(String name,int socialNum, int workDay, String entity){
        this.name = name;
        this.socialNum = socialNum;
        this.workDay = workDay;
        this.entity = entity;
    }
    public Object(int socialNum, String entity){
        this.socialNum = socialNum;
        this.entity = entity;
    }
}
