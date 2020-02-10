package com.app.tarea5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void textCount() {
        assertEquals(" 1. o * 25  *************************\n 2. r * 24  ************************\n " +
                "3. e * 59  ***********************************************************\n " +
                "4. l * 22  **********************\n 5. i * 38  **************************************\n " +
                "6. m * 19  *******************\n 7. s * 39  ***************************************\n " +
                "8. p * 19  *******************\n 9. u * 17  *****************\n " +
                "10. d * 16  ****************\n", app.textCount("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
    }
}