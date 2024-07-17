package org.example.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MathLibraryTest1 {

    MathLibrary mathLibrary = new MathLibrary();

    @Test
    public void testAdd() {
        List inputList = new ArrayList();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        assertEquals(10, mathLibrary.add(inputList));
    }
}