package org.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest2 {

    MathLibrary mathLibrary = new MathLibrary();

    @Test
    void testAdd() {
        assertEquals(6, mathLibrary.add(List.of(1, 2, 3)));
    }
}