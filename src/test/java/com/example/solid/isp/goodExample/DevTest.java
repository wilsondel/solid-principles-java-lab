package com.example.solid.isp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DevTest {

    @Test
    void workReturnsCorrectString() {
        Dev dev = new Dev();
        String expected = "Escribiendo código...";
        String actual = dev.work();
        assertEquals(expected, actual);
    }
}
