package ru.javafortesters.competitions.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotionTest {
    private IMotion motion;

    @Test
    void jumpTest() {
        motion=new Motion();
        assertTrue(motion.jump( 0.5,1.5));
    }

    @Test
    void runTest() {
        motion=new Motion();
        assertTrue(motion.run(100,200));
    }
}