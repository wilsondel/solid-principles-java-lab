package com.example.solid.isp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GoodExampleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    // You might want to restore System.out after all tests, but for simple cases BeforeEach is fine.
    // @AfterEach
    // void restoreStreams() {
    //     System.setOut(originalOut);
    // }

    @Test
    void testDevWork() {
        Dev dev = new Dev();
        dev.work();
        assertTrue(outContent.toString().contains("Escribiendo código..."));
    }

    @Test
    void testStudentWork() {
        Student student = new Student();
        student.work();
        assertTrue(outContent.toString().contains("Estudiando desde casa..."));
    }

    @Test
    void testStudentEat() {
        Student student = new Student();
        student.eat();
        assertTrue(outContent.toString().contains("Almorzando de 12 a 1 PM..."));
    }
}
