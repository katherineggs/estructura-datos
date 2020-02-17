package com.app.tarea6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {
    @Test
    void ubicacion() {
        assertEquals("Cuadrante 1", Met.ubicacion(5,6));
        assertEquals("Cuadrante 2", Met.ubicacion(-5,6));
        assertEquals("Cuadrante 3", Met.ubicacion(-5,-6));
        assertEquals("Cuadrante 4", Met.ubicacion(5,-6));
    }
}