package com.example.solid.isp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void workReturnsCorrectString() {
        Student student = new Student();
        String expected = "Estudiando desde casa...";
        String actual = student.work();
        assertEquals(expected, actual);
    }

    @Test
    void eatReturnsCorrectString() {
        Student student = new Student();
        String expected = "Almorzando de 12 a 1 PM...";
        String actual = student.eat();
        assertEquals(expected, actual);
    }
}
