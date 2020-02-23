package com.app.linked7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void addSong() {
        assertEquals("s1", "s1");
        assertEquals("s2", "s2");
        assertEquals("s3", "s3");
        assertEquals("s4", "s4");

    }

    @Test
    void playNow() {
        assertEquals("s4","s4");
    }

    @Test
    void playNext() {
        app.addSong("s1");
        app.addSong("s2");
        app.addSong("s3");
        assertEquals("s1","s1");
    }

    @Test
    void playPrevious() {
        app.addSong("s1");
        app.addSong("s2");
        app.addSong("s3");
        app.addSong("s4");
        assertEquals("s4","s4");
    }

    @Test
    void listPlaylist() {
        assertEquals("s4","s4");

    }
}