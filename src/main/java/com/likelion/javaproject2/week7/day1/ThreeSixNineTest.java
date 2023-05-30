package com.likelion.javaproject2.week7.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSixNineTest {
    @org.junit.jupiter.api.Test
    void testIs369(){
        assertEquals("*", ThreeSixNine2.is369(3));
        assertEquals("", ThreeSixNine2.is369(15));
        assertEquals("**", ThreeSixNine2.is369(99));
        assertEquals("***", ThreeSixNine3.is369(9994));
    }
}