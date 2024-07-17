package org.example.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class MathLibraryTest2 {

    MathLibrary mathLibrary = new MathLibrary();

    @Test
    void testAdd() {
        List inputList = new ArrayList();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        assertEquals(6, mathLibrary.add(inputList));
    }
}