package com.queue.tarea3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class Tarea3Test {
    @Test
    void push() {
        ArrayList<String> queue = new ArrayList<>();
        ArrayList<String> queueTest = new ArrayList<>();
        queueTest.add("withdraw Katherine 500");
        queueTest.add("deposit Fab 500");
        queue.add("withdraw Katherine 500");
        assertThat(Tarea3.push("deposit Fab 500",queue),is (queueTest));
    }
    @Test
    void pop() {
        ArrayList<String> queue = new ArrayList<>();
        ArrayList<String> queueTest = new ArrayList<>();
        queueTest.add("withdraw Katherine 500");
        queue.add("deposit Andrea 300");
        queue.add("withdraw Katherine 500");
        assertThat(Tarea3.pop(queue), is (queueTest));
    }
    @Test
    void clear() {
        ArrayList<String> queue = new ArrayList<>();
        ArrayList<String> queueTest = new ArrayList<>();
        queue.add("withdraw Fabricio 800");
        queue.add("deposit Andrea 300");
        queue.add("withdraw Katherine 500");
        assertThat(Tarea3.clear(queue), is (queueTest));
    }
    @Test
    void show() {
        ArrayList<String> queue = new ArrayList<>();
        ArrayList<String> queueTest = new ArrayList<>();
        queue.add("withdraw Steven 800");
        queue.add("deposit Andrea 300");
        queue.add("withdraw JP 500");
        queueTest.add("withdraw Steven 800");
        queueTest.add("deposit Andrea 300");
        queueTest.add("withdraw JP 500");
        assertThat(Tarea3.show(queue), is (queueTest));
    }
}